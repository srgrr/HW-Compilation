grammar hw_compilation;


options {
    output = AST;
}

tokens {
    ROOT;
    INSTR_LIST;
    FUNC_CALL;
    PARAM;
}


@header {
    package parser;
}

@lexer::header {
    package parser;
}


program : VECTOR_SIZE int_value (function)+ EOF -> ^(ROOT int_value (function)+)
	;
	
function: FUNC^ ID args? vars? list_instructions CNUF!
	;

args	: ARG^ ID (COMMA! ID)* GRA!
	;

vars	: VAR^ ID (COMMA! ID)* RAV!
        ;

list_instructions : (instruction SEPARATOR)+ -> ^(INSTR_LIST (instruction)+)
	;
	
instruction : assignment_stmt
	  | ite_stmt
	  | while_stmt
	  ;
	  
expr	: andterm (OR^ andterm)*;
andterm : bwor (AND^ bwor)*;
bwor	: bwxor (BWOR^ bwxor)*;
bwxor   : bwand (BWXOR^ bwand)*;
bwand   : cmpterm (BWAND^ cmpterm)*;
cmpterm : relational_term ((LEQ^|NEQ^) relational_term)*;
relational_term : bwshift ((LT^|LTE^|GT^|GTE^) bwshift)*;
bwshift : arith_term ((SHIFT_LEFT^ | SHIFT_RIGHT^) arith_term)*;
arith_term : unary_term ((PLUS^|MINUS^) unary_term)*;
unary_term : (BWNOT^|LNOT^|PLUS^|MINUS^)? atom;
atom	: int_value
	| LPAREN! expr RPAREN!
	| func_call
	| ID
	;
	
assignment_stmt : ID EQ^ expr
	  ;
	  
ite_stmt : IF^ expr THEN! list_instructions else_stmt? FI!
	 ;
	 
else_stmt: ELSE! list_instructions
	 ;

while_stmt : WHILE^ expr DO! list_instructions ELIHW!
	   ;
	     
func_call : ID LPAREN params? RPAREN -> ^(FUNC_CALL ID params?)
          ;

params : expr (COMMA expr)* -> ^(PARAM expr (expr)*)
       ;
	   
int_value : BINARY | DEC | HEX
	  ;


VECTOR_SIZE : 'VECTOR_SIZE';
FUNC : 'FUNC' ;
CNUF : 'CNUF' ;
ARG  : 'ARG'  ;
GRA  : 'GRA'  ;
VAR  : 'VAR'  ;
RAV  : 'RAV'  ;
IF   : 'IF'   ;
THEN : 'THEN' ;
ELSE : 'ELSE' ;
FI   : 'FI'   ;
WHILE: 'WHILE';
DO   : 'DO'   ;
ELIHW: 'ELIHW';
OR: 'OR'      ;
AND: 'AND'    ;
BWOR: '|'     ;
BWXOR: '^'    ;
BWAND: '&'    ;
SHIFT_LEFT: '<<';
SHIFT_RIGHT: '>>';
LEQ: '==';
NEQ: '!=';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';
PLUS: '+';
MINUS: '-';
BWNOT: '~';
LNOT: '!';
LPAREN: '('   ;
RPAREN: ')'   ;
EQ   : '='    ;
COMMA: ','    ;
SEPARATOR: ';';
BINARY : '0b' ('0'..'1')+ ;
HEX : '0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+ ;
DEC : ('0'..'9')+ ;
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
// White spaces
WS  	: ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;
