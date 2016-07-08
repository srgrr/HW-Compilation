// $ANTLR 3.4 /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g 2015-05-30 13:49:21

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class hw_compilationParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARG", "BINARY", "BWAND", "BWNOT", "BWOR", "BWXOR", "CNUF", "COMMA", "DEC", "DO", "ELIHW", "ELSE", "EQ", "FI", "FUNC", "FUNC_CALL", "GRA", "GT", "GTE", "HEX", "ID", "IF", "INSTR_LIST", "LEQ", "LNOT", "LPAREN", "LT", "LTE", "MINUS", "NEQ", "OR", "PARAM", "PLUS", "RAV", "ROOT", "RPAREN", "SEPARATOR", "SHIFT_LEFT", "SHIFT_RIGHT", "THEN", "VAR", "VECTOR_SIZE", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ARG=5;
    public static final int BINARY=6;
    public static final int BWAND=7;
    public static final int BWNOT=8;
    public static final int BWOR=9;
    public static final int BWXOR=10;
    public static final int CNUF=11;
    public static final int COMMA=12;
    public static final int DEC=13;
    public static final int DO=14;
    public static final int ELIHW=15;
    public static final int ELSE=16;
    public static final int EQ=17;
    public static final int FI=18;
    public static final int FUNC=19;
    public static final int FUNC_CALL=20;
    public static final int GRA=21;
    public static final int GT=22;
    public static final int GTE=23;
    public static final int HEX=24;
    public static final int ID=25;
    public static final int IF=26;
    public static final int INSTR_LIST=27;
    public static final int LEQ=28;
    public static final int LNOT=29;
    public static final int LPAREN=30;
    public static final int LT=31;
    public static final int LTE=32;
    public static final int MINUS=33;
    public static final int NEQ=34;
    public static final int OR=35;
    public static final int PARAM=36;
    public static final int PLUS=37;
    public static final int RAV=38;
    public static final int ROOT=39;
    public static final int RPAREN=40;
    public static final int SEPARATOR=41;
    public static final int SHIFT_LEFT=42;
    public static final int SHIFT_RIGHT=43;
    public static final int THEN=44;
    public static final int VAR=45;
    public static final int VECTOR_SIZE=46;
    public static final int WHILE=47;
    public static final int WS=48;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public hw_compilationParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public hw_compilationParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return hw_compilationParser.tokenNames; }
    public String getGrammarFileName() { return "/home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:1: program : VECTOR_SIZE int_value ( function )+ EOF -> ^( ROOT int_value ( function )+ ) ;
    public final hw_compilationParser.program_return program() throws RecognitionException {
        hw_compilationParser.program_return retval = new hw_compilationParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VECTOR_SIZE1=null;
        Token EOF4=null;
        hw_compilationParser.int_value_return int_value2 =null;

        hw_compilationParser.function_return function3 =null;


        Object VECTOR_SIZE1_tree=null;
        Object EOF4_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_VECTOR_SIZE=new RewriteRuleTokenStream(adaptor,"token VECTOR_SIZE");
        RewriteRuleSubtreeStream stream_int_value=new RewriteRuleSubtreeStream(adaptor,"rule int_value");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:9: ( VECTOR_SIZE int_value ( function )+ EOF -> ^( ROOT int_value ( function )+ ) )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:11: VECTOR_SIZE int_value ( function )+ EOF
            {
            VECTOR_SIZE1=(Token)match(input,VECTOR_SIZE,FOLLOW_VECTOR_SIZE_in_program77);  
            stream_VECTOR_SIZE.add(VECTOR_SIZE1);


            pushFollow(FOLLOW_int_value_in_program79);
            int_value2=int_value();

            state._fsp--;

            stream_int_value.add(int_value2.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:33: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:34: function
            	    {
            	    pushFollow(FOLLOW_function_in_program82);
            	    function3=function();

            	    state._fsp--;

            	    stream_function.add(function3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program86);  
            stream_EOF.add(EOF4);


            // AST REWRITE
            // elements: int_value, function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:49: -> ^( ROOT int_value ( function )+ )
            {
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:25:52: ^( ROOT int_value ( function )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROOT, "ROOT")
                , root_1);

                adaptor.addChild(root_1, stream_int_value.nextTree());

                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:1: function : FUNC ^ ID ( args )? ( vars )? list_instructions CNUF !;
    public final hw_compilationParser.function_return function() throws RecognitionException {
        hw_compilationParser.function_return retval = new hw_compilationParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FUNC5=null;
        Token ID6=null;
        Token CNUF10=null;
        hw_compilationParser.args_return args7 =null;

        hw_compilationParser.vars_return vars8 =null;

        hw_compilationParser.list_instructions_return list_instructions9 =null;


        Object FUNC5_tree=null;
        Object ID6_tree=null;
        Object CNUF10_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:9: ( FUNC ^ ID ( args )? ( vars )? list_instructions CNUF !)
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:11: FUNC ^ ID ( args )? ( vars )? list_instructions CNUF !
            {
            root_0 = (Object)adaptor.nil();


            FUNC5=(Token)match(input,FUNC,FOLLOW_FUNC_in_function109); 
            FUNC5_tree = 
            (Object)adaptor.create(FUNC5)
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNC5_tree, root_0);


            ID6=(Token)match(input,ID,FOLLOW_ID_in_function112); 
            ID6_tree = 
            (Object)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:20: ( args )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ARG) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:20: args
                    {
                    pushFollow(FOLLOW_args_in_function114);
                    args7=args();

                    state._fsp--;

                    adaptor.addChild(root_0, args7.getTree());

                    }
                    break;

            }


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:26: ( vars )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:28:26: vars
                    {
                    pushFollow(FOLLOW_vars_in_function117);
                    vars8=vars();

                    state._fsp--;

                    adaptor.addChild(root_0, vars8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_list_instructions_in_function120);
            list_instructions9=list_instructions();

            state._fsp--;

            adaptor.addChild(root_0, list_instructions9.getTree());

            CNUF10=(Token)match(input,CNUF,FOLLOW_CNUF_in_function122); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:31:1: args : ARG ^ ID ( COMMA ! ID )* GRA !;
    public final hw_compilationParser.args_return args() throws RecognitionException {
        hw_compilationParser.args_return retval = new hw_compilationParser.args_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ARG11=null;
        Token ID12=null;
        Token COMMA13=null;
        Token ID14=null;
        Token GRA15=null;

        Object ARG11_tree=null;
        Object ID12_tree=null;
        Object COMMA13_tree=null;
        Object ID14_tree=null;
        Object GRA15_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:31:6: ( ARG ^ ID ( COMMA ! ID )* GRA !)
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:31:8: ARG ^ ID ( COMMA ! ID )* GRA !
            {
            root_0 = (Object)adaptor.nil();


            ARG11=(Token)match(input,ARG,FOLLOW_ARG_in_args133); 
            ARG11_tree = 
            (Object)adaptor.create(ARG11)
            ;
            root_0 = (Object)adaptor.becomeRoot(ARG11_tree, root_0);


            ID12=(Token)match(input,ID,FOLLOW_ID_in_args136); 
            ID12_tree = 
            (Object)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:31:16: ( COMMA ! ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:31:17: COMMA ! ID
            	    {
            	    COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_args139); 

            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_args142); 
            	    ID14_tree = 
            	    (Object)adaptor.create(ID14)
            	    ;
            	    adaptor.addChild(root_0, ID14_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            GRA15=(Token)match(input,GRA,FOLLOW_GRA_in_args146); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vars"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:34:1: vars : VAR ^ ID ( COMMA ! ID )* RAV !;
    public final hw_compilationParser.vars_return vars() throws RecognitionException {
        hw_compilationParser.vars_return retval = new hw_compilationParser.vars_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR16=null;
        Token ID17=null;
        Token COMMA18=null;
        Token ID19=null;
        Token RAV20=null;

        Object VAR16_tree=null;
        Object ID17_tree=null;
        Object COMMA18_tree=null;
        Object ID19_tree=null;
        Object RAV20_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:34:6: ( VAR ^ ID ( COMMA ! ID )* RAV !)
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:34:8: VAR ^ ID ( COMMA ! ID )* RAV !
            {
            root_0 = (Object)adaptor.nil();


            VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_vars157); 
            VAR16_tree = 
            (Object)adaptor.create(VAR16)
            ;
            root_0 = (Object)adaptor.becomeRoot(VAR16_tree, root_0);


            ID17=(Token)match(input,ID,FOLLOW_ID_in_vars160); 
            ID17_tree = 
            (Object)adaptor.create(ID17)
            ;
            adaptor.addChild(root_0, ID17_tree);


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:34:16: ( COMMA ! ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:34:17: COMMA ! ID
            	    {
            	    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_vars163); 

            	    ID19=(Token)match(input,ID,FOLLOW_ID_in_vars166); 
            	    ID19_tree = 
            	    (Object)adaptor.create(ID19)
            	    ;
            	    adaptor.addChild(root_0, ID19_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            RAV20=(Token)match(input,RAV,FOLLOW_RAV_in_vars170); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vars"


    public static class list_instructions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_instructions"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:1: list_instructions : ( instruction SEPARATOR )+ -> ^( INSTR_LIST ( instruction )+ ) ;
    public final hw_compilationParser.list_instructions_return list_instructions() throws RecognitionException {
        hw_compilationParser.list_instructions_return retval = new hw_compilationParser.list_instructions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEPARATOR22=null;
        hw_compilationParser.instruction_return instruction21 =null;


        Object SEPARATOR22_tree=null;
        RewriteRuleTokenStream stream_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token SEPARATOR");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:19: ( ( instruction SEPARATOR )+ -> ^( INSTR_LIST ( instruction )+ ) )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:21: ( instruction SEPARATOR )+
            {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:21: ( instruction SEPARATOR )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ID && LA6_0 <= IF)||LA6_0==WHILE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:22: instruction SEPARATOR
            	    {
            	    pushFollow(FOLLOW_instruction_in_list_instructions189);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    SEPARATOR22=(Token)match(input,SEPARATOR,FOLLOW_SEPARATOR_in_list_instructions191);  
            	    stream_SEPARATOR.add(SEPARATOR22);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:46: -> ^( INSTR_LIST ( instruction )+ )
            {
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:37:49: ^( INSTR_LIST ( instruction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSTR_LIST, "INSTR_LIST")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:40:1: instruction : ( assignment_stmt | ite_stmt | while_stmt );
    public final hw_compilationParser.instruction_return instruction() throws RecognitionException {
        hw_compilationParser.instruction_return retval = new hw_compilationParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        hw_compilationParser.assignment_stmt_return assignment_stmt23 =null;

        hw_compilationParser.ite_stmt_return ite_stmt24 =null;

        hw_compilationParser.while_stmt_return while_stmt25 =null;



        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:40:13: ( assignment_stmt | ite_stmt | while_stmt )
            int alt7=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt7=1;
                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:40:15: assignment_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_stmt_in_instruction215);
                    assignment_stmt23=assignment_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_stmt23.getTree());

                    }
                    break;
                case 2 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:41:6: ite_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction222);
                    ite_stmt24=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt24.getTree());

                    }
                    break;
                case 3 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:42:6: while_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction229);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:45:1: expr : andterm ( OR ^ andterm )* ;
    public final hw_compilationParser.expr_return expr() throws RecognitionException {
        hw_compilationParser.expr_return retval = new hw_compilationParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR27=null;
        hw_compilationParser.andterm_return andterm26 =null;

        hw_compilationParser.andterm_return andterm28 =null;


        Object OR27_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:45:6: ( andterm ( OR ^ andterm )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:45:8: andterm ( OR ^ andterm )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_andterm_in_expr244);
            andterm26=andterm();

            state._fsp--;

            adaptor.addChild(root_0, andterm26.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:45:16: ( OR ^ andterm )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:45:17: OR ^ andterm
            	    {
            	    OR27=(Token)match(input,OR,FOLLOW_OR_in_expr247); 
            	    OR27_tree = 
            	    (Object)adaptor.create(OR27)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR27_tree, root_0);


            	    pushFollow(FOLLOW_andterm_in_expr250);
            	    andterm28=andterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andterm28.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class andterm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andterm"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:46:1: andterm : bwor ( AND ^ bwor )* ;
    public final hw_compilationParser.andterm_return andterm() throws RecognitionException {
        hw_compilationParser.andterm_return retval = new hw_compilationParser.andterm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND30=null;
        hw_compilationParser.bwor_return bwor29 =null;

        hw_compilationParser.bwor_return bwor31 =null;


        Object AND30_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:46:9: ( bwor ( AND ^ bwor )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:46:11: bwor ( AND ^ bwor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bwor_in_andterm259);
            bwor29=bwor();

            state._fsp--;

            adaptor.addChild(root_0, bwor29.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:46:16: ( AND ^ bwor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:46:17: AND ^ bwor
            	    {
            	    AND30=(Token)match(input,AND,FOLLOW_AND_in_andterm262); 
            	    AND30_tree = 
            	    (Object)adaptor.create(AND30)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND30_tree, root_0);


            	    pushFollow(FOLLOW_bwor_in_andterm265);
            	    bwor31=bwor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bwor31.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andterm"


    public static class bwor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bwor"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:47:1: bwor : bwxor ( BWOR ^ bwxor )* ;
    public final hw_compilationParser.bwor_return bwor() throws RecognitionException {
        hw_compilationParser.bwor_return retval = new hw_compilationParser.bwor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BWOR33=null;
        hw_compilationParser.bwxor_return bwxor32 =null;

        hw_compilationParser.bwxor_return bwxor34 =null;


        Object BWOR33_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:47:6: ( bwxor ( BWOR ^ bwxor )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:47:8: bwxor ( BWOR ^ bwxor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bwxor_in_bwor274);
            bwxor32=bwxor();

            state._fsp--;

            adaptor.addChild(root_0, bwxor32.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:47:14: ( BWOR ^ bwxor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BWOR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:47:15: BWOR ^ bwxor
            	    {
            	    BWOR33=(Token)match(input,BWOR,FOLLOW_BWOR_in_bwor277); 
            	    BWOR33_tree = 
            	    (Object)adaptor.create(BWOR33)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BWOR33_tree, root_0);


            	    pushFollow(FOLLOW_bwxor_in_bwor280);
            	    bwxor34=bwxor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bwxor34.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bwor"


    public static class bwxor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bwxor"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:48:1: bwxor : bwand ( BWXOR ^ bwand )* ;
    public final hw_compilationParser.bwxor_return bwxor() throws RecognitionException {
        hw_compilationParser.bwxor_return retval = new hw_compilationParser.bwxor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BWXOR36=null;
        hw_compilationParser.bwand_return bwand35 =null;

        hw_compilationParser.bwand_return bwand37 =null;


        Object BWXOR36_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:48:9: ( bwand ( BWXOR ^ bwand )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:48:11: bwand ( BWXOR ^ bwand )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bwand_in_bwxor291);
            bwand35=bwand();

            state._fsp--;

            adaptor.addChild(root_0, bwand35.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:48:17: ( BWXOR ^ bwand )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BWXOR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:48:18: BWXOR ^ bwand
            	    {
            	    BWXOR36=(Token)match(input,BWXOR,FOLLOW_BWXOR_in_bwxor294); 
            	    BWXOR36_tree = 
            	    (Object)adaptor.create(BWXOR36)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BWXOR36_tree, root_0);


            	    pushFollow(FOLLOW_bwand_in_bwxor297);
            	    bwand37=bwand();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bwand37.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bwxor"


    public static class bwand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bwand"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:49:1: bwand : cmpterm ( BWAND ^ cmpterm )* ;
    public final hw_compilationParser.bwand_return bwand() throws RecognitionException {
        hw_compilationParser.bwand_return retval = new hw_compilationParser.bwand_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BWAND39=null;
        hw_compilationParser.cmpterm_return cmpterm38 =null;

        hw_compilationParser.cmpterm_return cmpterm40 =null;


        Object BWAND39_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:49:9: ( cmpterm ( BWAND ^ cmpterm )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:49:11: cmpterm ( BWAND ^ cmpterm )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpterm_in_bwand308);
            cmpterm38=cmpterm();

            state._fsp--;

            adaptor.addChild(root_0, cmpterm38.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:49:19: ( BWAND ^ cmpterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BWAND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:49:20: BWAND ^ cmpterm
            	    {
            	    BWAND39=(Token)match(input,BWAND,FOLLOW_BWAND_in_bwand311); 
            	    BWAND39_tree = 
            	    (Object)adaptor.create(BWAND39)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BWAND39_tree, root_0);


            	    pushFollow(FOLLOW_cmpterm_in_bwand314);
            	    cmpterm40=cmpterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cmpterm40.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bwand"


    public static class cmpterm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpterm"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:1: cmpterm : relational_term ( ( LEQ ^| NEQ ^) relational_term )* ;
    public final hw_compilationParser.cmpterm_return cmpterm() throws RecognitionException {
        hw_compilationParser.cmpterm_return retval = new hw_compilationParser.cmpterm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEQ42=null;
        Token NEQ43=null;
        hw_compilationParser.relational_term_return relational_term41 =null;

        hw_compilationParser.relational_term_return relational_term44 =null;


        Object LEQ42_tree=null;
        Object NEQ43_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:9: ( relational_term ( ( LEQ ^| NEQ ^) relational_term )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:11: relational_term ( ( LEQ ^| NEQ ^) relational_term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_term_in_cmpterm323);
            relational_term41=relational_term();

            state._fsp--;

            adaptor.addChild(root_0, relational_term41.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:27: ( ( LEQ ^| NEQ ^) relational_term )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LEQ||LA14_0==NEQ) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:28: ( LEQ ^| NEQ ^) relational_term
            	    {
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:28: ( LEQ ^| NEQ ^)
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==LEQ) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==NEQ) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:29: LEQ ^
            	            {
            	            LEQ42=(Token)match(input,LEQ,FOLLOW_LEQ_in_cmpterm327); 
            	            LEQ42_tree = 
            	            (Object)adaptor.create(LEQ42)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LEQ42_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:50:34: NEQ ^
            	            {
            	            NEQ43=(Token)match(input,NEQ,FOLLOW_NEQ_in_cmpterm330); 
            	            NEQ43_tree = 
            	            (Object)adaptor.create(NEQ43)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NEQ43_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_term_in_cmpterm334);
            	    relational_term44=relational_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_term44.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmpterm"


    public static class relational_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_term"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:1: relational_term : bwshift ( ( LT ^| LTE ^| GT ^| GTE ^) bwshift )* ;
    public final hw_compilationParser.relational_term_return relational_term() throws RecognitionException {
        hw_compilationParser.relational_term_return retval = new hw_compilationParser.relational_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT46=null;
        Token LTE47=null;
        Token GT48=null;
        Token GTE49=null;
        hw_compilationParser.bwshift_return bwshift45 =null;

        hw_compilationParser.bwshift_return bwshift50 =null;


        Object LT46_tree=null;
        Object LTE47_tree=null;
        Object GT48_tree=null;
        Object GTE49_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:17: ( bwshift ( ( LT ^| LTE ^| GT ^| GTE ^) bwshift )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:19: bwshift ( ( LT ^| LTE ^| GT ^| GTE ^) bwshift )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bwshift_in_relational_term343);
            bwshift45=bwshift();

            state._fsp--;

            adaptor.addChild(root_0, bwshift45.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:27: ( ( LT ^| LTE ^| GT ^| GTE ^) bwshift )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= GT && LA16_0 <= GTE)||(LA16_0 >= LT && LA16_0 <= LTE)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:28: ( LT ^| LTE ^| GT ^| GTE ^) bwshift
            	    {
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:28: ( LT ^| LTE ^| GT ^| GTE ^)
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case LTE:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case GTE:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:29: LT ^
            	            {
            	            LT46=(Token)match(input,LT,FOLLOW_LT_in_relational_term347); 
            	            LT46_tree = 
            	            (Object)adaptor.create(LT46)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT46_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:33: LTE ^
            	            {
            	            LTE47=(Token)match(input,LTE,FOLLOW_LTE_in_relational_term350); 
            	            LTE47_tree = 
            	            (Object)adaptor.create(LTE47)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTE47_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:38: GT ^
            	            {
            	            GT48=(Token)match(input,GT,FOLLOW_GT_in_relational_term353); 
            	            GT48_tree = 
            	            (Object)adaptor.create(GT48)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT48_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:51:42: GTE ^
            	            {
            	            GTE49=(Token)match(input,GTE,FOLLOW_GTE_in_relational_term356); 
            	            GTE49_tree = 
            	            (Object)adaptor.create(GTE49)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTE49_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bwshift_in_relational_term360);
            	    bwshift50=bwshift();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bwshift50.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_term"


    public static class bwshift_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bwshift"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:1: bwshift : arith_term ( ( SHIFT_LEFT ^| SHIFT_RIGHT ^) arith_term )* ;
    public final hw_compilationParser.bwshift_return bwshift() throws RecognitionException {
        hw_compilationParser.bwshift_return retval = new hw_compilationParser.bwshift_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SHIFT_LEFT52=null;
        Token SHIFT_RIGHT53=null;
        hw_compilationParser.arith_term_return arith_term51 =null;

        hw_compilationParser.arith_term_return arith_term54 =null;


        Object SHIFT_LEFT52_tree=null;
        Object SHIFT_RIGHT53_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:9: ( arith_term ( ( SHIFT_LEFT ^| SHIFT_RIGHT ^) arith_term )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:11: arith_term ( ( SHIFT_LEFT ^| SHIFT_RIGHT ^) arith_term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arith_term_in_bwshift369);
            arith_term51=arith_term();

            state._fsp--;

            adaptor.addChild(root_0, arith_term51.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:22: ( ( SHIFT_LEFT ^| SHIFT_RIGHT ^) arith_term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= SHIFT_LEFT && LA18_0 <= SHIFT_RIGHT)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:23: ( SHIFT_LEFT ^| SHIFT_RIGHT ^) arith_term
            	    {
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:23: ( SHIFT_LEFT ^| SHIFT_RIGHT ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==SHIFT_LEFT) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==SHIFT_RIGHT) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:24: SHIFT_LEFT ^
            	            {
            	            SHIFT_LEFT52=(Token)match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_bwshift373); 
            	            SHIFT_LEFT52_tree = 
            	            (Object)adaptor.create(SHIFT_LEFT52)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SHIFT_LEFT52_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:52:38: SHIFT_RIGHT ^
            	            {
            	            SHIFT_RIGHT53=(Token)match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_bwshift378); 
            	            SHIFT_RIGHT53_tree = 
            	            (Object)adaptor.create(SHIFT_RIGHT53)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SHIFT_RIGHT53_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_arith_term_in_bwshift382);
            	    arith_term54=arith_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith_term54.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bwshift"


    public static class arith_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith_term"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:1: arith_term : unary_term ( ( PLUS ^| MINUS ^) unary_term )* ;
    public final hw_compilationParser.arith_term_return arith_term() throws RecognitionException {
        hw_compilationParser.arith_term_return retval = new hw_compilationParser.arith_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS56=null;
        Token MINUS57=null;
        hw_compilationParser.unary_term_return unary_term55 =null;

        hw_compilationParser.unary_term_return unary_term58 =null;


        Object PLUS56_tree=null;
        Object MINUS57_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:12: ( unary_term ( ( PLUS ^| MINUS ^) unary_term )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:14: unary_term ( ( PLUS ^| MINUS ^) unary_term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_term_in_arith_term391);
            unary_term55=unary_term();

            state._fsp--;

            adaptor.addChild(root_0, unary_term55.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:25: ( ( PLUS ^| MINUS ^) unary_term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:26: ( PLUS ^| MINUS ^) unary_term
            	    {
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:26: ( PLUS ^| MINUS ^)
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==PLUS) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==MINUS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:27: PLUS ^
            	            {
            	            PLUS56=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_term395); 
            	            PLUS56_tree = 
            	            (Object)adaptor.create(PLUS56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS56_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:53:33: MINUS ^
            	            {
            	            MINUS57=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_term398); 
            	            MINUS57_tree = 
            	            (Object)adaptor.create(MINUS57)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MINUS57_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_term_in_arith_term402);
            	    unary_term58=unary_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_term58.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arith_term"


    public static class unary_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_term"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:1: unary_term : ( BWNOT ^| LNOT ^| PLUS ^| MINUS ^)? atom ;
    public final hw_compilationParser.unary_term_return unary_term() throws RecognitionException {
        hw_compilationParser.unary_term_return retval = new hw_compilationParser.unary_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BWNOT59=null;
        Token LNOT60=null;
        Token PLUS61=null;
        Token MINUS62=null;
        hw_compilationParser.atom_return atom63 =null;


        Object BWNOT59_tree=null;
        Object LNOT60_tree=null;
        Object PLUS61_tree=null;
        Object MINUS62_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:12: ( ( BWNOT ^| LNOT ^| PLUS ^| MINUS ^)? atom )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:14: ( BWNOT ^| LNOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (Object)adaptor.nil();


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:14: ( BWNOT ^| LNOT ^| PLUS ^| MINUS ^)?
            int alt21=5;
            switch ( input.LA(1) ) {
                case BWNOT:
                    {
                    alt21=1;
                    }
                    break;
                case LNOT:
                    {
                    alt21=2;
                    }
                    break;
                case PLUS:
                    {
                    alt21=3;
                    }
                    break;
                case MINUS:
                    {
                    alt21=4;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:15: BWNOT ^
                    {
                    BWNOT59=(Token)match(input,BWNOT,FOLLOW_BWNOT_in_unary_term412); 
                    BWNOT59_tree = 
                    (Object)adaptor.create(BWNOT59)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BWNOT59_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:22: LNOT ^
                    {
                    LNOT60=(Token)match(input,LNOT,FOLLOW_LNOT_in_unary_term415); 
                    LNOT60_tree = 
                    (Object)adaptor.create(LNOT60)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(LNOT60_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:28: PLUS ^
                    {
                    PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_term418); 
                    PLUS61_tree = 
                    (Object)adaptor.create(PLUS61)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(PLUS61_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:54:34: MINUS ^
                    {
                    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_term421); 
                    MINUS62_tree = 
                    (Object)adaptor.create(MINUS62)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(MINUS62_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_unary_term426);
            atom63=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom63.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_term"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:55:1: atom : ( int_value | LPAREN ! expr RPAREN !| func_call | ID );
    public final hw_compilationParser.atom_return atom() throws RecognitionException {
        hw_compilationParser.atom_return retval = new hw_compilationParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN65=null;
        Token RPAREN67=null;
        Token ID69=null;
        hw_compilationParser.int_value_return int_value64 =null;

        hw_compilationParser.expr_return expr66 =null;

        hw_compilationParser.func_call_return func_call68 =null;


        Object LPAREN65_tree=null;
        Object RPAREN67_tree=null;
        Object ID69_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:55:6: ( int_value | LPAREN ! expr RPAREN !| func_call | ID )
            int alt22=4;
            switch ( input.LA(1) ) {
            case BINARY:
            case DEC:
            case HEX:
                {
                alt22=1;
                }
                break;
            case LPAREN:
                {
                alt22=2;
                }
                break;
            case ID:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==LPAREN) ) {
                    alt22=3;
                }
                else if ( (LA22_3==AND||LA22_3==BWAND||(LA22_3 >= BWOR && LA22_3 <= BWXOR)||LA22_3==COMMA||LA22_3==DO||(LA22_3 >= GT && LA22_3 <= GTE)||LA22_3==LEQ||(LA22_3 >= LT && LA22_3 <= OR)||LA22_3==PLUS||(LA22_3 >= RPAREN && LA22_3 <= THEN)) ) {
                    alt22=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:55:8: int_value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_value_in_atom433);
                    int_value64=int_value();

                    state._fsp--;

                    adaptor.addChild(root_0, int_value64.getTree());

                    }
                    break;
                case 2 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:56:4: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom438); 

                    pushFollow(FOLLOW_expr_in_atom441);
                    expr66=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr66.getTree());

                    RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom443); 

                    }
                    break;
                case 3 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:57:4: func_call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_func_call_in_atom449);
                    func_call68=func_call();

                    state._fsp--;

                    adaptor.addChild(root_0, func_call68.getTree());

                    }
                    break;
                case 4 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:58:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID69=(Token)match(input,ID,FOLLOW_ID_in_atom454); 
                    ID69_tree = 
                    (Object)adaptor.create(ID69)
                    ;
                    adaptor.addChild(root_0, ID69_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class assignment_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_stmt"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:61:1: assignment_stmt : ID EQ ^ expr ;
    public final hw_compilationParser.assignment_stmt_return assignment_stmt() throws RecognitionException {
        hw_compilationParser.assignment_stmt_return retval = new hw_compilationParser.assignment_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID70=null;
        Token EQ71=null;
        hw_compilationParser.expr_return expr72 =null;


        Object ID70_tree=null;
        Object EQ71_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:61:17: ( ID EQ ^ expr )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:61:19: ID EQ ^ expr
            {
            root_0 = (Object)adaptor.nil();


            ID70=(Token)match(input,ID,FOLLOW_ID_in_assignment_stmt465); 
            ID70_tree = 
            (Object)adaptor.create(ID70)
            ;
            adaptor.addChild(root_0, ID70_tree);


            EQ71=(Token)match(input,EQ,FOLLOW_EQ_in_assignment_stmt467); 
            EQ71_tree = 
            (Object)adaptor.create(EQ71)
            ;
            root_0 = (Object)adaptor.becomeRoot(EQ71_tree, root_0);


            pushFollow(FOLLOW_expr_in_assignment_stmt470);
            expr72=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr72.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_stmt"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:64:1: ite_stmt : IF ^ expr THEN ! list_instructions ( else_stmt )? FI !;
    public final hw_compilationParser.ite_stmt_return ite_stmt() throws RecognitionException {
        hw_compilationParser.ite_stmt_return retval = new hw_compilationParser.ite_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF73=null;
        Token THEN75=null;
        Token FI78=null;
        hw_compilationParser.expr_return expr74 =null;

        hw_compilationParser.list_instructions_return list_instructions76 =null;

        hw_compilationParser.else_stmt_return else_stmt77 =null;


        Object IF73_tree=null;
        Object THEN75_tree=null;
        Object FI78_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:64:10: ( IF ^ expr THEN ! list_instructions ( else_stmt )? FI !)
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:64:12: IF ^ expr THEN ! list_instructions ( else_stmt )? FI !
            {
            root_0 = (Object)adaptor.nil();


            IF73=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt485); 
            IF73_tree = 
            (Object)adaptor.create(IF73)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF73_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt488);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            THEN75=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt490); 

            pushFollow(FOLLOW_list_instructions_in_ite_stmt493);
            list_instructions76=list_instructions();

            state._fsp--;

            adaptor.addChild(root_0, list_instructions76.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:64:45: ( else_stmt )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:64:45: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_ite_stmt495);
                    else_stmt77=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt77.getTree());

                    }
                    break;

            }


            FI78=(Token)match(input,FI,FOLLOW_FI_in_ite_stmt498); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:67:1: else_stmt : ELSE ! list_instructions ;
    public final hw_compilationParser.else_stmt_return else_stmt() throws RecognitionException {
        hw_compilationParser.else_stmt_return retval = new hw_compilationParser.else_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE79=null;
        hw_compilationParser.list_instructions_return list_instructions80 =null;


        Object ELSE79_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:67:10: ( ELSE ! list_instructions )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:67:12: ELSE ! list_instructions
            {
            root_0 = (Object)adaptor.nil();


            ELSE79=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt511); 

            pushFollow(FOLLOW_list_instructions_in_else_stmt514);
            list_instructions80=list_instructions();

            state._fsp--;

            adaptor.addChild(root_0, list_instructions80.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:70:1: while_stmt : WHILE ^ expr DO ! list_instructions ELIHW !;
    public final hw_compilationParser.while_stmt_return while_stmt() throws RecognitionException {
        hw_compilationParser.while_stmt_return retval = new hw_compilationParser.while_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE81=null;
        Token DO83=null;
        Token ELIHW85=null;
        hw_compilationParser.expr_return expr82 =null;

        hw_compilationParser.list_instructions_return list_instructions84 =null;


        Object WHILE81_tree=null;
        Object DO83_tree=null;
        Object ELIHW85_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:70:12: ( WHILE ^ expr DO ! list_instructions ELIHW !)
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:70:14: WHILE ^ expr DO ! list_instructions ELIHW !
            {
            root_0 = (Object)adaptor.nil();


            WHILE81=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt525); 
            WHILE81_tree = 
            (Object)adaptor.create(WHILE81)
            ;
            root_0 = (Object)adaptor.becomeRoot(WHILE81_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt528);
            expr82=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr82.getTree());

            DO83=(Token)match(input,DO,FOLLOW_DO_in_while_stmt530); 

            pushFollow(FOLLOW_list_instructions_in_while_stmt533);
            list_instructions84=list_instructions();

            state._fsp--;

            adaptor.addChild(root_0, list_instructions84.getTree());

            ELIHW85=(Token)match(input,ELIHW,FOLLOW_ELIHW_in_while_stmt535); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class func_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_call"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:1: func_call : ID LPAREN ( params )? RPAREN -> ^( FUNC_CALL ID ( params )? ) ;
    public final hw_compilationParser.func_call_return func_call() throws RecognitionException {
        hw_compilationParser.func_call_return retval = new hw_compilationParser.func_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID86=null;
        Token LPAREN87=null;
        Token RPAREN89=null;
        hw_compilationParser.params_return params88 =null;


        Object ID86_tree=null;
        Object LPAREN87_tree=null;
        Object RPAREN89_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:11: ( ID LPAREN ( params )? RPAREN -> ^( FUNC_CALL ID ( params )? ) )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:13: ID LPAREN ( params )? RPAREN
            {
            ID86=(Token)match(input,ID,FOLLOW_ID_in_func_call555);  
            stream_ID.add(ID86);


            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_call557);  
            stream_LPAREN.add(LPAREN87);


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:23: ( params )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BINARY||LA24_0==BWNOT||LA24_0==DEC||(LA24_0 >= HEX && LA24_0 <= ID)||(LA24_0 >= LNOT && LA24_0 <= LPAREN)||LA24_0==MINUS||LA24_0==PLUS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:23: params
                    {
                    pushFollow(FOLLOW_params_in_func_call559);
                    params88=params();

                    state._fsp--;

                    stream_params.add(params88.getTree());

                    }
                    break;

            }


            RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_call562);  
            stream_RPAREN.add(RPAREN89);


            // AST REWRITE
            // elements: ID, params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:38: -> ^( FUNC_CALL ID ( params )? )
            {
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:41: ^( FUNC_CALL ID ( params )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNC_CALL, "FUNC_CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:73:56: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_call"


    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:1: params : expr ( COMMA expr )* -> ^( PARAM expr ( expr )* ) ;
    public final hw_compilationParser.params_return params() throws RecognitionException {
        hw_compilationParser.params_return retval = new hw_compilationParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA91=null;
        hw_compilationParser.expr_return expr90 =null;

        hw_compilationParser.expr_return expr92 =null;


        Object COMMA91_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:8: ( expr ( COMMA expr )* -> ^( PARAM expr ( expr )* ) )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:10: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_params592);
            expr90=expr();

            state._fsp--;

            stream_expr.add(expr90.getTree());

            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:15: ( COMMA expr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:16: COMMA expr
            	    {
            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_params595);  
            	    stream_COMMA.add(COMMA91);


            	    pushFollow(FOLLOW_expr_in_params597);
            	    expr92=expr();

            	    state._fsp--;

            	    stream_expr.add(expr92.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // AST REWRITE
            // elements: expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:29: -> ^( PARAM expr ( expr )* )
            {
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:32: ^( PARAM expr ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAM, "PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:76:45: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class int_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_value"
    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:79:1: int_value : ( BINARY | DEC | HEX );
    public final hw_compilationParser.int_value_return int_value() throws RecognitionException {
        hw_compilationParser.int_value_return retval = new hw_compilationParser.int_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:79:11: ( BINARY | DEC | HEX )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:
            {
            root_0 = (Object)adaptor.nil();


            set93=(Token)input.LT(1);

            if ( input.LA(1)==BINARY||input.LA(1)==DEC||input.LA(1)==HEX ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set93)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_value"

    // Delegated rules


 

    public static final BitSet FOLLOW_VECTOR_SIZE_in_program77 = new BitSet(new long[]{0x0000000001002040L});
    public static final BitSet FOLLOW_int_value_in_program79 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_function_in_program82 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_program86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function109 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_function112 = new BitSet(new long[]{0x0000A00006000020L});
    public static final BitSet FOLLOW_args_in_function114 = new BitSet(new long[]{0x0000A00006000000L});
    public static final BitSet FOLLOW_vars_in_function117 = new BitSet(new long[]{0x0000800006000000L});
    public static final BitSet FOLLOW_list_instructions_in_function120 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CNUF_in_function122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARG_in_args133 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_args136 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_COMMA_in_args139 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_args142 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_GRA_in_args146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_vars157 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_vars160 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_COMMA_in_vars163 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_vars166 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_RAV_in_vars170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_list_instructions189 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_list_instructions191 = new BitSet(new long[]{0x0000800006000002L});
    public static final BitSet FOLLOW_assignment_stmt_in_instruction215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_expr244 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_OR_in_expr247 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_andterm_in_expr250 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_bwor_in_andterm259 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_andterm262 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_bwor_in_andterm265 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_bwxor_in_bwor274 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_BWOR_in_bwor277 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_bwxor_in_bwor280 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_bwand_in_bwxor291 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_BWXOR_in_bwxor294 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_bwand_in_bwxor297 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_cmpterm_in_bwand308 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BWAND_in_bwand311 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_cmpterm_in_bwand314 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_relational_term_in_cmpterm323 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_LEQ_in_cmpterm327 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_NEQ_in_cmpterm330 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_relational_term_in_cmpterm334 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_bwshift_in_relational_term343 = new BitSet(new long[]{0x0000000180C00002L});
    public static final BitSet FOLLOW_LT_in_relational_term347 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_LTE_in_relational_term350 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_GT_in_relational_term353 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_GTE_in_relational_term356 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_bwshift_in_relational_term360 = new BitSet(new long[]{0x0000000180C00002L});
    public static final BitSet FOLLOW_arith_term_in_bwshift369 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_bwshift373 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_bwshift378 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_arith_term_in_bwshift382 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_unary_term_in_arith_term391 = new BitSet(new long[]{0x0000002200000002L});
    public static final BitSet FOLLOW_PLUS_in_arith_term395 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_MINUS_in_arith_term398 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_unary_term_in_arith_term402 = new BitSet(new long[]{0x0000002200000002L});
    public static final BitSet FOLLOW_BWNOT_in_unary_term412 = new BitSet(new long[]{0x0000000043002040L});
    public static final BitSet FOLLOW_LNOT_in_unary_term415 = new BitSet(new long[]{0x0000000043002040L});
    public static final BitSet FOLLOW_PLUS_in_unary_term418 = new BitSet(new long[]{0x0000000043002040L});
    public static final BitSet FOLLOW_MINUS_in_unary_term421 = new BitSet(new long[]{0x0000000043002040L});
    public static final BitSet FOLLOW_atom_in_unary_term426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_atom433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom438 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_expr_in_atom441 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_call_in_atom449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_stmt465 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQ_in_assignment_stmt467 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_expr_in_assignment_stmt470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt485 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_expr_in_ite_stmt488 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt490 = new BitSet(new long[]{0x0000800006000000L});
    public static final BitSet FOLLOW_list_instructions_in_ite_stmt493 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt495 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FI_in_ite_stmt498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt511 = new BitSet(new long[]{0x0000800006000000L});
    public static final BitSet FOLLOW_list_instructions_in_else_stmt514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt525 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_expr_in_while_stmt528 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_stmt530 = new BitSet(new long[]{0x0000800006000000L});
    public static final BitSet FOLLOW_list_instructions_in_while_stmt533 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELIHW_in_while_stmt535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_func_call555 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_func_call557 = new BitSet(new long[]{0x0000012263002140L});
    public static final BitSet FOLLOW_params_in_func_call559 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_func_call562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params592 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_params595 = new BitSet(new long[]{0x0000002263002140L});
    public static final BitSet FOLLOW_expr_in_params597 = new BitSet(new long[]{0x0000000000001002L});

}