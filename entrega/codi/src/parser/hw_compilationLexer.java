// $ANTLR 3.4 /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g 2015-05-30 13:49:22

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class hw_compilationLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public hw_compilationLexer() {} 
    public hw_compilationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public hw_compilationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g"; }

    // $ANTLR start "VECTOR_SIZE"
    public final void mVECTOR_SIZE() throws RecognitionException {
        try {
            int _type = VECTOR_SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:83:13: ( 'VECTOR_SIZE' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:83:15: 'VECTOR_SIZE'
            {
            match("VECTOR_SIZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VECTOR_SIZE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:84:6: ( 'FUNC' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:84:8: 'FUNC'
            {
            match("FUNC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "CNUF"
    public final void mCNUF() throws RecognitionException {
        try {
            int _type = CNUF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:85:6: ( 'CNUF' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:85:8: 'CNUF'
            {
            match("CNUF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CNUF"

    // $ANTLR start "ARG"
    public final void mARG() throws RecognitionException {
        try {
            int _type = ARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:86:6: ( 'ARG' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:86:8: 'ARG'
            {
            match("ARG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARG"

    // $ANTLR start "GRA"
    public final void mGRA() throws RecognitionException {
        try {
            int _type = GRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:87:6: ( 'GRA' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:87:8: 'GRA'
            {
            match("GRA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRA"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:88:6: ( 'VAR' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:88:8: 'VAR'
            {
            match("VAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "RAV"
    public final void mRAV() throws RecognitionException {
        try {
            int _type = RAV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:89:6: ( 'RAV' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:89:8: 'RAV'
            {
            match("RAV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAV"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:90:6: ( 'IF' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:90:8: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:91:6: ( 'THEN' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:91:8: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:92:6: ( 'ELSE' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:92:8: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FI"
    public final void mFI() throws RecognitionException {
        try {
            int _type = FI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:93:6: ( 'FI' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:93:8: 'FI'
            {
            match("FI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FI"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:94:6: ( 'WHILE' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:94:8: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:95:6: ( 'DO' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:95:8: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELIHW"
    public final void mELIHW() throws RecognitionException {
        try {
            int _type = ELIHW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:96:6: ( 'ELIHW' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:96:8: 'ELIHW'
            {
            match("ELIHW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIHW"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:97:3: ( 'OR' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:97:5: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:98:4: ( 'AND' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:98:6: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "BWOR"
    public final void mBWOR() throws RecognitionException {
        try {
            int _type = BWOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:99:5: ( '|' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:99:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BWOR"

    // $ANTLR start "BWXOR"
    public final void mBWXOR() throws RecognitionException {
        try {
            int _type = BWXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:100:6: ( '^' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:100:8: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BWXOR"

    // $ANTLR start "BWAND"
    public final void mBWAND() throws RecognitionException {
        try {
            int _type = BWAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:101:6: ( '&' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:101:8: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BWAND"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:102:11: ( '<<' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:102:13: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:103:12: ( '>>' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:103:14: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:104:4: ( '==' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:104:6: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:105:4: ( '!=' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:105:6: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:106:3: ( '<' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:106:5: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:107:4: ( '<=' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:107:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:108:3: ( '>' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:108:5: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:109:4: ( '>=' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:109:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:110:5: ( '+' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:110:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:111:6: ( '-' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:111:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "BWNOT"
    public final void mBWNOT() throws RecognitionException {
        try {
            int _type = BWNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:112:6: ( '~' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:112:8: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BWNOT"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:113:5: ( '!' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:113:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:114:7: ( '(' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:114:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:115:7: ( ')' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:115:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:116:6: ( '=' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:116:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:117:6: ( ',' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:117:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:118:10: ( ';' )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:118:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:119:8: ( '0b' ( '0' .. '1' )+ )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:119:10: '0b' ( '0' .. '1' )+
            {
            match("0b"); 



            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:119:15: ( '0' .. '1' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '1')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:120:5: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:120:7: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 



            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:120:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'F')||(LA2_0 >= 'a' && LA2_0 <= 'f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:121:5: ( ( '0' .. '9' )+ )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:121:7: ( '0' .. '9' )+
            {
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:121:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:122:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:122:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:122:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:124:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:124:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:8: ( VECTOR_SIZE | FUNC | CNUF | ARG | GRA | VAR | RAV | IF | THEN | ELSE | FI | WHILE | DO | ELIHW | OR | AND | BWOR | BWXOR | BWAND | SHIFT_LEFT | SHIFT_RIGHT | LEQ | NEQ | LT | LTE | GT | GTE | PLUS | MINUS | BWNOT | LNOT | LPAREN | RPAREN | EQ | COMMA | SEPARATOR | BINARY | HEX | DEC | ID | WS )
        int alt5=41;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:10: VECTOR_SIZE
                {
                mVECTOR_SIZE(); 


                }
                break;
            case 2 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:22: FUNC
                {
                mFUNC(); 


                }
                break;
            case 3 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:27: CNUF
                {
                mCNUF(); 


                }
                break;
            case 4 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:32: ARG
                {
                mARG(); 


                }
                break;
            case 5 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:36: GRA
                {
                mGRA(); 


                }
                break;
            case 6 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:40: VAR
                {
                mVAR(); 


                }
                break;
            case 7 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:44: RAV
                {
                mRAV(); 


                }
                break;
            case 8 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:48: IF
                {
                mIF(); 


                }
                break;
            case 9 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:51: THEN
                {
                mTHEN(); 


                }
                break;
            case 10 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:56: ELSE
                {
                mELSE(); 


                }
                break;
            case 11 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:61: FI
                {
                mFI(); 


                }
                break;
            case 12 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:64: WHILE
                {
                mWHILE(); 


                }
                break;
            case 13 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:70: DO
                {
                mDO(); 


                }
                break;
            case 14 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:73: ELIHW
                {
                mELIHW(); 


                }
                break;
            case 15 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:79: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:82: AND
                {
                mAND(); 


                }
                break;
            case 17 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:86: BWOR
                {
                mBWOR(); 


                }
                break;
            case 18 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:91: BWXOR
                {
                mBWXOR(); 


                }
                break;
            case 19 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:97: BWAND
                {
                mBWAND(); 


                }
                break;
            case 20 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:103: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 


                }
                break;
            case 21 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:114: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 


                }
                break;
            case 22 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:126: LEQ
                {
                mLEQ(); 


                }
                break;
            case 23 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:130: NEQ
                {
                mNEQ(); 


                }
                break;
            case 24 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:134: LT
                {
                mLT(); 


                }
                break;
            case 25 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:137: LTE
                {
                mLTE(); 


                }
                break;
            case 26 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:141: GT
                {
                mGT(); 


                }
                break;
            case 27 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:144: GTE
                {
                mGTE(); 


                }
                break;
            case 28 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:148: PLUS
                {
                mPLUS(); 


                }
                break;
            case 29 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:153: MINUS
                {
                mMINUS(); 


                }
                break;
            case 30 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:159: BWNOT
                {
                mBWNOT(); 


                }
                break;
            case 31 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:165: LNOT
                {
                mLNOT(); 


                }
                break;
            case 32 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:170: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 33 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:177: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 34 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:184: EQ
                {
                mEQ(); 


                }
                break;
            case 35 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:187: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 36 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:193: SEPARATOR
                {
                mSEPARATOR(); 


                }
                break;
            case 37 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:203: BINARY
                {
                mBINARY(); 


                }
                break;
            case 38 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:210: HEX
                {
                mHEX(); 


                }
                break;
            case 39 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:214: DEC
                {
                mDEC(); 


                }
                break;
            case 40 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:218: ID
                {
                mID(); 


                }
                break;
            case 41 :
                // /home/sergio/hw-compilation/entrega/codi/src/parser/hw_compilation.g:1:221: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\14\35\3\uffff\1\60\1\63\1\65\1\67\7\uffff\1\34\3\uffff"+
        "\3\35\1\75\5\35\1\103\3\35\1\110\1\111\14\uffff\1\35\1\113\1\35"+
        "\1\uffff\1\35\1\116\1\117\1\120\1\121\1\uffff\4\35\2\uffff\1\35"+
        "\1\uffff\1\127\1\130\4\uffff\1\131\1\132\3\35\4\uffff\1\136\1\137"+
        "\1\35\2\uffff\4\35\1\145\1\uffff";
    static final String DFA5_eofS =
        "\146\uffff";
    static final String DFA5_minS =
        "\1\11\1\101\1\111\2\116\1\122\1\101\1\106\1\110\1\114\1\110\1\117"+
        "\1\122\3\uffff\1\74\3\75\7\uffff\1\142\3\uffff\1\103\1\122\1\116"+
        "\1\60\1\125\1\107\1\104\1\101\1\126\1\60\1\105\2\111\2\60\14\uffff"+
        "\1\124\1\60\1\103\1\uffff\1\106\4\60\1\uffff\1\116\1\105\1\110\1"+
        "\114\2\uffff\1\117\1\uffff\2\60\4\uffff\2\60\1\127\1\105\1\122\4"+
        "\uffff\2\60\1\137\2\uffff\1\123\1\111\1\132\1\105\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\176\1\105\1\125\1\116\2\122\1\101\1\106\1\110\1\114\1\110\1\117"+
        "\1\122\3\uffff\1\75\1\76\2\75\7\uffff\1\170\3\uffff\1\103\1\122"+
        "\1\116\1\172\1\125\1\107\1\104\1\101\1\126\1\172\1\105\1\123\1\111"+
        "\2\172\14\uffff\1\124\1\172\1\103\1\uffff\1\106\4\172\1\uffff\1"+
        "\116\1\105\1\110\1\114\2\uffff\1\117\1\uffff\2\172\4\uffff\2\172"+
        "\1\127\1\105\1\122\4\uffff\2\172\1\137\2\uffff\1\123\1\111\1\132"+
        "\1\105\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\15\uffff\1\21\1\22\1\23\4\uffff\1\34\1\35\1\36\1\40\1\41\1\43\1"+
        "\44\1\uffff\1\47\1\50\1\51\17\uffff\1\24\1\31\1\30\1\25\1\33\1\32"+
        "\1\26\1\42\1\27\1\37\1\45\1\46\3\uffff\1\13\5\uffff\1\10\4\uffff"+
        "\1\15\1\17\1\uffff\1\6\2\uffff\1\4\1\20\1\5\1\7\5\uffff\1\2\1\3"+
        "\1\11\1\12\3\uffff\1\16\1\14\5\uffff\1\1";
    static final String DFA5_specialS =
        "\146\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\23\4\uffff\1\17\1\uffff\1"+
            "\27\1\30\1\uffff\1\24\1\31\1\25\2\uffff\1\33\11\34\1\uffff\1"+
            "\32\1\20\1\22\1\21\2\uffff\1\4\1\35\1\3\1\13\1\11\1\2\1\5\1"+
            "\35\1\7\5\35\1\14\2\35\1\6\1\35\1\10\1\35\1\1\1\12\3\35\3\uffff"+
            "\1\16\1\35\1\uffff\32\35\1\uffff\1\15\1\uffff\1\26",
            "\1\40\3\uffff\1\37",
            "\1\42\13\uffff\1\41",
            "\1\43",
            "\1\45\3\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "\1\56\1\57",
            "\1\62\1\61",
            "\1\64",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\25\uffff\1\71",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\104",
            "\1\106\11\uffff\1\105",
            "\1\107",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\114",
            "",
            "\1\115",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VECTOR_SIZE | FUNC | CNUF | ARG | GRA | VAR | RAV | IF | THEN | ELSE | FI | WHILE | DO | ELIHW | OR | AND | BWOR | BWXOR | BWAND | SHIFT_LEFT | SHIFT_RIGHT | LEQ | NEQ | LT | LTE | GT | GTE | PLUS | MINUS | BWNOT | LNOT | LPAREN | RPAREN | EQ | COMMA | SEPARATOR | BINARY | HEX | DEC | ID | WS );";
        }
    }
 

}