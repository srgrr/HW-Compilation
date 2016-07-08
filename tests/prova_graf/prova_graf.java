package prova_graf;
import org.antlr.runtime.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.*;
import parser.*;
import semantics.*;

public class prova_graf {

	public static String readFile( String file ) throws IOException {
	    BufferedReader reader = new BufferedReader( new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }

	    return stringBuilder.toString();
	}
	
  public static void main(String[] args) throws Exception {
    String src = readFile(args[0]);
    hw_compilationLexer lexer = new hw_compilationLexer(new ANTLRStringStream(src));
    hw_compilationParser parser = new hw_compilationParser(new CommonTokenStream(lexer));
    HWCompilationTreeAdaptor adaptor = new HWCompilationTreeAdaptor();
    parser.setTreeAdaptor(adaptor);
    HWCompilationTree tree = (HWCompilationTree)parser.program().getTree();
    TreeTraverser tree_traverser = new TreeTraverser(tree);
    System.out.println(tree_traverser.getErrorLog());
  }
}