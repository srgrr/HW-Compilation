package hw_compilation;
import parser.*;
import semantics.*;
import translator.*;
import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class hw_compilation {
	public static void main(String[] args) throws Exception {
	    String src = readFile(args[0]);
	    hw_compilationLexer lexer = new hw_compilationLexer(new ANTLRStringStream(src));
	    hw_compilationParser parser = new hw_compilationParser(new CommonTokenStream(lexer));
	    HWCompilationTreeAdaptor adaptor = new HWCompilationTreeAdaptor();
	    parser.setTreeAdaptor(adaptor);
	    HWCompilationTree tree = (HWCompilationTree)parser.program().getTree();
	    TreeTraverser tree_traverser = new TreeTraverser(tree);
	    System.out.println(tree_traverser.getErrorLog());
	    if(!tree_traverser.isCorrect()) {
	      System.exit(0);
	    }
	    String out_path = args[0] + ".v";
	    if (args.length > 1) out_path = args[1];
	    Translator trans = new Translator(out_path,
	    	tree_traverser.getRoot(),
	    	tree_traverser.getFunctions(),
	    	tree_traverser.getUsedFunctions(),
	    	tree_traverser.getNumberOfCalls(),
	    	tree_traverser.getNumberOfAssignments());
	    trans.translate_program();
	}

	private static String readFile(String file) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");
	    while((line = reader.readLine()) != null) {
	        stringBuilder.append(line);
	        stringBuilder.append(ls);
	    }
	    return stringBuilder.toString();
	}

	private static void displayHelp() {
		System.out.println("**HWCompilation Language**");
		System.out.println("Authors: Francesc-Xavier Gispert & Sergio Rodriguez Guasch");
		System.out.println("----------");
		System.out.println("Usage: java -jar <your path>/HWCompilation.jar [input file path]");
	}
}
