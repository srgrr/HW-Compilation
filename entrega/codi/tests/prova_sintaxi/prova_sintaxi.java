package prova_sintaxi;
import org.antlr.runtime.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.*;
import parser.*;

public class prova_sintaxi {

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
    CommonTree tree = (CommonTree)parser.program().getTree();
    DOTTreeGenerator gen = new DOTTreeGenerator();
    StringTemplate st = gen.toDOT(tree);
    System.out.println(st);
  }
}