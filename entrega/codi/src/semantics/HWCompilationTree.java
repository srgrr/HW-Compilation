package semantics;
import org.antlr.runtime.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.runtime.Token;

/*
  Falta: getters i setters.
  A treetraverser assignar el parent (currentNode agafa parent).
  Inicialitzar i actualitzar el hashmap de treetraverser numberofcalls.
      --> El mateix per a numberOfAssigments.
*/

public class HWCompilationTree extends CommonTree {
	
	private String funcName;
	private Integer funcCallId;
	private Integer assigId;
	
	
	public HWCompilationTree(Token t) {
		super(t);
	}
	
	public HWCompilationTree getChild(int i) {
        return (HWCompilationTree) super.getChild(i);
    }
	
	public void setFuncName(String val) {
		funcName = val;
	}
	
	public String getFuncName() {
		return funcName;
	}
	
	public void setFuncCallId(Integer id) {
	    funcCallId = id;
	}
	
	public Integer getFuncCallId() {
	    return funcCallId;
	}
	
	public void setAssigId(Integer id) {
	    assigId = id;
	}
	
	public Integer getAssigId() {
	    return assigId;
	}
	
}
