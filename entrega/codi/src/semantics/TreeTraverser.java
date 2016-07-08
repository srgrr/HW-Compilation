package semantics;
import parser.*;
import semantics.*;
import java.io.*;
import java.util.*;
import org.antlr.runtime.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
/*
	Classe que realitza comprovacions semantiques.
	Rep com entrada un AST (aixo vol dir que aqui se suposa que el programa es sintacticament correcte)
*/
public class TreeTraverser {
	// Nom de les funcions
	private TreeSet<String> functionNames = new TreeSet<>();
	// Nom de les funcions en minuscula
	private TreeSet<String> normalizedFunctionNames = new TreeSet<>();
	// Arbre sintactic previament obtingut
	private HWCompilationTree root;
	// Nodes de les funcions.
	private HashMap< String, HWCompilationTree > functions = new HashMap<>();
	// Log d'errors i warnings, es van afegint segons es troben.
	private String errorLog;
	// Graf de crides
	private HashMap< String, ArrayList<HWCompilationTree> >  callGraph = new HashMap<>();
	// Equivalent a un vector de visitats
	private TreeSet<String> vis = new TreeSet<>();
	// Nombre de crides que es fan a les funcions.
	private HashMap<String, Integer> numberOfCalls = new HashMap<>();
	// Nombre d'assignacions que es fan a les variables (args, var i retname).
	private HashMap<String, HashMap<String, Integer>> numberOfAssignments = new HashMap<>();
	// Parent (o callers) de les funcions.
	private HashMap<String, String> parent = new HashMap<>();
	// Boolea que indica si hem trobat algun error el qual ens ha de fer avortar.
	private boolean ko;
	// Nom de la funcio main
	private String mainFunctionName;
	// Pila auxiliar de tarjan
	private Stack<String> recursiveTerminationOrder = new Stack<>();
	// Graf transpost de tarjan
	private HashMap<String, ArrayList<HWCompilationTree>> transposeCallGraph = new HashMap<>();

	// Llegir nom de funcions.
	private void _getFunctionNames() {
		boolean hasMainFunction = false;
		for(int i=1; i<root.getChildCount(); ++i) {
			if(root.getChild(i).getType() == hw_compilationLexer.FUNC) {
				String functionName = root.getChild(i).getChild(0).getText();
				if(normalizedFunctionNames.contains(functionName.toLowerCase())) {
					errorLog += "Error: La funcio " + functionName + " esta declarada en dos llocs diferents.\n";
					ko = true;
				}
				numberOfCalls.put(functionName, 0);
				numberOfAssignments.put(functionName, new HashMap<String, Integer>());
				functionNames.add(functionName);
				normalizedFunctionNames.add(functionName.toLowerCase());
				if(functionName.toLowerCase().equals("main")) {
					hasMainFunction = true;
					mainFunctionName = functionName;
				}
				functions.put(functionName, (HWCompilationTree)root.getChild(i));
			}
		}
		if(!hasMainFunction) {
			errorLog += "Error: No hi ha funcio principal definida.\n";
			ko = true;
		}
	}

	/*
		Funcio que recorre una expressio.
		Es rep el nom de la funcio pare, els noms visibles (arguments i variables)
		i el node actual.
	*/
	private void traverseExpression(String parent, TreeSet<String> namesInScope, HWCompilationTree currentNode) {
		currentNode.setFuncName(parent);
		// identificador...
		if(currentNode.getType() == hw_compilationLexer.ID) {
			String varName = currentNode.getText();
			if(!namesInScope.contains(varName)) {
				errorLog += "Error: A la funcio " + parent + " es fa referencia a la variable " + varName + ", la qual no esta definida.\n";
				ko = true;
				return;
			}
		}
		// valor enter
		if(currentNode.getType() == hw_compilationLexer.BINARY ||
		   	currentNode.getType() == hw_compilationLexer.DEC ||
		   	currentNode.getType() == hw_compilationLexer.HEX
			) return;
		// crida a funcio
		if(currentNode.getType() == hw_compilationLexer.FUNC_CALL) {
			String calleeName = currentNode.getChild(0).getText();
			if(!functionNames.contains(calleeName)) {
				errorLog += "Error: A la funcio " + parent + " es crida a la funcio " + calleeName + ", la qual no esta definida.\n";
				ko = true;
				return;
			}
			currentNode.setFuncCallId(numberOfCalls.get(calleeName));
			numberOfCalls.put(calleeName, numberOfCalls.get(calleeName) + 1);
			// La funcio existeix, mirar que el nombre de parametres que es passen son els correctes.
			HWCompilationTree calleeNode = (HWCompilationTree)functions.get(calleeName);
			calleeNode.setFuncName(parent);
			int arity = 0;
			for(int i=0; i<calleeNode.getChildCount(); ++i) {
				if(calleeNode.getChild(i).getType() == hw_compilationLexer.ARG) {
					for(int j = 0; j < calleeNode.getChild(i).getChildCount(); ++j)
					  calleeNode.getChild(i).getChild(j).setFuncName(parent);
					arity = calleeNode.getChild(i).getChildCount();
					break; // huh!
				}
			}
			int proposedArity = 0;
			if(currentNode.getChildCount() == 2) {
				proposedArity = currentNode.getChild(1).getChildCount();
				// travessem els parametres
				for(int i=0; i<currentNode.getChild(1).getChildCount(); ++i) {
					traverseExpression(parent, namesInScope, (HWCompilationTree)currentNode.getChild(1).getChild(i));
					if(ko) return;
				}
			}
			if(arity != proposedArity) {
				errorLog += "Error: A la funcio " + parent + " es crida la funcio " + calleeName + 
				", la qual espera " + arity + " arguments. No obstant, se li estan aplicant " + proposedArity  + ".\n";
				ko = true;
				return;
			}
			// travessem la funcio cridada
			traverseTree(calleeNode);
			if(ko) return;
			// afegim al graf de crides la aresta corresponent
			callGraph.get(parent).add(calleeNode);
			transposeCallGraph.get(calleeName).add(functions.get(parent));
		}
		// Operadors, puc no diferenciar d'unaris i binaris excepte en la mida.
		if( currentNode.getType() == hw_compilationLexer.OR ||
			currentNode.getType() == hw_compilationLexer.AND ||
			currentNode.getType() == hw_compilationLexer.BWOR ||
			currentNode.getType() == hw_compilationLexer.BWAND ||
			currentNode.getType() == hw_compilationLexer.LEQ ||
			currentNode.getType() == hw_compilationLexer.NEQ ||
			currentNode.getType() == hw_compilationLexer.LT ||
			currentNode.getType() == hw_compilationLexer.LTE ||
			currentNode.getType() == hw_compilationLexer.GT ||
			currentNode.getType() == hw_compilationLexer.GTE ||
			currentNode.getType() == hw_compilationLexer.SHIFT_LEFT ||
			currentNode.getType() == hw_compilationLexer.SHIFT_RIGHT ||
			currentNode.getType() == hw_compilationLexer.MINUS ||
			currentNode.getType() == hw_compilationLexer.PLUS || 
			currentNode.getType() == hw_compilationLexer.BWXOR ||
			currentNode.getType() == hw_compilationLexer.LNOT ||
			currentNode.getType() == hw_compilationLexer.BWNOT) {
			traverseExpression(parent, namesInScope, (HWCompilationTree)currentNode.getChild(0));
			if(ko) return;
			if(currentNode.getChildCount() == 2)
				traverseExpression(parent, namesInScope, (HWCompilationTree)currentNode.getChild(1));
		}
	}
	/*
		Funcio que recorre una llista d'instruccions.
		Es rep el nom de la funcio pare, els noms visibles (arguments i variables)
		i el node actual.
	*/
	private void traverseInstructionList(String parent, TreeSet<String> namesInScope, HWCompilationTree currentNode) {
		currentNode.setFuncName(parent);
		for(int i=0; i<currentNode.getChildCount(); ++i) {
			traverseInstruction(parent, namesInScope, (HWCompilationTree)currentNode.getChild(i));
			if(ko) return;
		}
	}
	/*
		Funcio que recorre una instruccio.
		Es rep el nom de la funcio pare, els noms visibles (arguments i variables)
		i el node actual.
	*/
	private void traverseInstruction(String parent, TreeSet<String> namesInScope, HWCompilationTree currentNode) {
		currentNode.setFuncName(parent);
		if(currentNode.getType() == hw_compilationLexer.EQ) {
			// Una assignacio te un identificador i una expressio.
			// Comprovem que l'identificador es, visible.
			HWCompilationTree ident = (HWCompilationTree)currentNode.getChild(0);
			ident.setFuncName(parent);
			String identName = ident.getText();
			if(!namesInScope.contains(identName) && !parent.equals(identName)) {
				errorLog += "Error: La variable o argument " + identName + " no es visible a la funcio " + parent + "\n.";
				ko = true;
				return;
			}
			currentNode.setAssigId(numberOfAssignments.get(parent).get(identName));
			numberOfAssignments.get(parent).put(identName, numberOfAssignments.get(parent).get(identName) + 1);
			HWCompilationTree assignExpr = (HWCompilationTree)currentNode.getChild(1);
			traverseExpression(parent, namesInScope, assignExpr);
		} else if(currentNode.getType() == hw_compilationLexer.IF) {
			// Un if te una condicio, una llista d'instruccions
			// i, opcionalment, una llista d'instruccions addiccional
			// per l'else.
			HWCompilationTree conditionExpr = (HWCompilationTree)currentNode.getChild(0);
			traverseExpression(parent, namesInScope, conditionExpr);
			if(ko) return;
			HWCompilationTree thenListInstr = (HWCompilationTree)currentNode.getChild(1);
			traverseInstructionList(parent, namesInScope, thenListInstr);
			if(ko) return;
			if(currentNode.getChildCount() == 3) {
				// Vol dir que hi ha else
				HWCompilationTree elseListInstr = (HWCompilationTree)currentNode.getChild(2);
				traverseInstructionList(parent, namesInScope, elseListInstr);
			}
		}
		else { // implicitament, while
			HWCompilationTree conditionExpr = (HWCompilationTree)currentNode.getChild(0);
			traverseExpression(parent, namesInScope, conditionExpr);
			if(ko) return;
			HWCompilationTree innerListInstr = (HWCompilationTree)currentNode.getChild(1);
			traverseInstructionList(parent, namesInScope, innerListInstr);
		}
	}
	/*
		Funcio que recorre l'AST partint d'un node FUNC.
	*/
	private void traverseTree(HWCompilationTree currentNode) {
		String funcName = currentNode.getChild(0).getText();
		currentNode.setFuncName(funcName);
		// Si ja hem visitat aquesta funcio tornem.
		if(vis.contains(funcName)) return;
		// Afegim la funcio actual a la llista de visitats.
		vis.add(funcName);
		// Afegim els arguments i les variables a un conjunt.
		int offset = 1;
		HWCompilationTree arguments = (HWCompilationTree)currentNode.getChild(1);
		arguments.setFuncName(funcName);
		TreeSet<String> namesInScope = new TreeSet<>();
		TreeSet<String> normalizedNamesInScope = new TreeSet<>();
		if(arguments.getType() == hw_compilationLexer.ARG) {
			++offset;
			for(int i=0; i<arguments.getChildCount(); ++i) {
				String varName = arguments.getChild(i).getText();
				arguments.getChild(i).setFuncName(funcName);
				if(normalizedNamesInScope.contains(varName.toLowerCase())) {
					errorLog += "Error: A la funcio " + funcName + " es declara dues vegades l'argument o variable " + varName + "\n";
				}
				namesInScope.add(varName);
				normalizedNamesInScope.add(varName.toLowerCase());
			}
		}
		HWCompilationTree variables = (HWCompilationTree)currentNode.getChild(offset);
		variables.setFuncName(funcName);
		if(variables.getType() == hw_compilationLexer.VAR) {
			++offset;
			for(int i=0; i<variables.getChildCount(); ++i) {
				String varName = variables.getChild(i).getText();
				variables.getChild(i).setFuncName(funcName);
				if(normalizedNamesInScope.contains(varName.toLowerCase())) {
					errorLog += "Error: A la funcio " + funcName + " es declara dues vegades l'argument o variable " + varName + "\n";
					ko = true;
				}
				namesInScope.add(varName);
				normalizedNamesInScope.add(varName.toLowerCase());
			}
		}
		// Addiccionalment, comprovem que cap parametre es digui igual que una funcio.
		numberOfAssignments.get(funcName).put(funcName, 0);
		for(String var : namesInScope) {
			if(normalizedFunctionNames.contains(var.toLowerCase())) {
				errorLog += "Error: A la funcio " + funcName + " es declara una variable o parametre amb el nom de " + var + ", el qual tambe correspon a una funcio.\n";
				ko = true;
			}
			numberOfAssignments.get(funcName).put(var, 0);
		}
		if(ko) return;
		HWCompilationTree funcInstructionList = (HWCompilationTree)currentNode.getChild(offset);
		funcInstructionList.setFuncName(funcName);
		// Donat que no tenen sentit els procediments "void"
		// considerarem que es un error el fet de no retornar res.
		// ultima instruccio es assig ^ text del fill esquerre es funcName
		HWCompilationTree lastInstruction = (HWCompilationTree)funcInstructionList.getChild(funcInstructionList.getChildCount()-1);
		lastInstruction.setFuncName(funcName);
		boolean hasReturnStatement = lastInstruction.getType() == hw_compilationLexer.EQ &&
			lastInstruction.getChild(0).getText().equals(funcName);

		if(!hasReturnStatement) {
			errorLog += "Error: La funcio " + funcName + " no conte cap valor de retorn.\n";
			ko = true;
		}
		if(ko) return;

		// Iterem sobre la resta de fills de la funcio.
		traverseInstructionList(funcName, namesInScope, funcInstructionList);
	}
	/*
		Funcio que comprova que totes les funcions declarades son accesibles
		des del main. Serveix per tirar warning unicament.
	*/
	private void generateUnusedFunctionWarnings() {
		for(String func: functionNames) {
			if(!vis.contains(func))
				errorLog += "Advertencia: La funcio " + func + " es declara pero no es fa servir.\n";
		}
	}
	
	private void printFullTree(HWCompilationTree currentNode) { 
	  if(currentNode == null) return;
	  System.out.println("Node type:" + currentNode.getType());
	  System.out.println("Node content:" + currentNode.getText());
	  System.out.println("Node func parent:" + currentNode.getFuncName());
	  System.out.println("");
	  for(int i = 0; i < currentNode.getChildCount(); ++i)
	    printFullTree(currentNode.getChild(i));
	}
	
	/*
		Funcio que ordena els nodes per ordre de terminacio recursiva.
	*/
	private void fillSCCStack(String root) {
		if(vis.contains(root)) return;
		vis.add(root);
		for(HWCompilationTree calleeNode : callGraph.get(root))
			fillSCCStack(calleeNode.getChild(0).getText());
		recursiveTerminationOrder.push(root);
	}
	/*
		Funcio que travessa el graf transpost en l'ordre previament obtingut,
		descobrint les components fortament connexes.
	*/
	private TreeSet<String> traverseSCC(String root) {
		if(vis.contains(root)) return new TreeSet<>();
		TreeSet<String> ret = new TreeSet<>();
		ret.add(root);
		vis.add(root);
		for(HWCompilationTree calleeNode : transposeCallGraph.get(root)) {
			if(root.equals(calleeNode.getChild(0).getText())) {
				errorLog += "Error: La funcio " + root + " es crida a si mateixa.\n";
				ko = true;
			}
			TreeSet traversalSet = traverseSCC(calleeNode.getChild(0).getText());
			ret.addAll(traversalSet);
		}
		return ret;
	}
	/*
		Funcio que, a partir d'un graf de crides previament generat,
		comprova que no existeix cap component fortament connexa de mes d'un membre
		(la qual cosa implica que existeix una successio de crides que provoca recursivitat).
	*/
	private void checkRecursivity() {
		vis = new TreeSet<String>();
		String root = mainFunctionName;
		fillSCCStack(root);
		vis = new TreeSet<String>();
		while(!recursiveTerminationOrder.empty()) {
			String current_node = recursiveTerminationOrder.pop();
			if(!vis.contains(current_node)) {
				TreeSet<String> SCC = traverseSCC(current_node);
				if(SCC.size() > 1) {
					ko = true;
					errorLog += "Error: Les seguents funcions formen un cicle, generant recursivitat:\n";
					errorLog += SCC + "\n";
				}
			}
		}
	}
	/*
		Metode constructor. Rep l'arbre sintactic i el travessa comprovant que representa
		un programa correcte a nivell semantic i traduible.
	*/
	public TreeTraverser(HWCompilationTree tree) {
		ko = false;
		errorLog = "";
		root = (HWCompilationTree)tree;
		_getFunctionNames();
		if(!ko) {
			// Afegim el nom de les funcions al graf (nodes)
			for(String func : functionNames) {
				callGraph.put(func, new ArrayList<HWCompilationTree>());
				transposeCallGraph.put(func, new ArrayList<HWCompilationTree>());
			}
			traverseTree(functions.get(mainFunctionName));
		}
		checkRecursivity();
		if(!ko)
		generateUnusedFunctionWarnings();
	}
	/*
		Getters i setters.
	*/
	public boolean isCorrect() {
		return !ko;
	}

	public String getErrorLog() {
		return errorLog;
	}

	public TreeSet<String> getFunctionNames() {
		return functionNames;
	}
	public HWCompilationTree getRoot() {
		return root;
	}
	public TreeSet<String> getUsedFunctions() {
	    return vis;
	}
	public HashMap< String, HWCompilationTree > getFunctions() {
		return functions;
	}
	public HashMap< String, ArrayList<HWCompilationTree> > getCallGraph() {
		return callGraph;
	}
	public HashMap<String, Integer> getNumberOfCalls() {
		return numberOfCalls;
	}
	public HashMap<String, HashMap<String, Integer> > getNumberOfAssignments() {
		return numberOfAssignments;
	}

}
