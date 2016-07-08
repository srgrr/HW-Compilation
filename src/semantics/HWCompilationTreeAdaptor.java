package semantics;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class HWCompilationTreeAdaptor extends CommonTreeAdaptor{
	public Object create(Token t) {
		return new HWCompilationTree(t);
	}
	public Object dupNode(Object t) {
		if (t == null) return null;
		return create(((HWCompilationTree)t).token);
	}

	public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
		return null;
	}
}