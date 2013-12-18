grammar SymbolraetselAST;

options {
language = Java;
output=AST;
ASTLabelType=CommonTree;
}

tokens {
 START; EQUALS; BLOCK;
}


// applies only to the parser:
@header {
package symbolraetsel_AST_Solver.grammar.output;
}
 
// applies only to the lexer:
@lexer::header {
package symbolraetsel_AST_Solver.grammar.output;
}

start:	c00=letter	c01=arith	c02=letter	c03=EQUALS	c04=letter
	a00=arith		a02=arith     		a03=arith
	c10=letter	c11=arith 	c12=letter	c13=EQUALS	c14=letter
	e00=EQUALS		e02=EQUALS		e04=EQUALS
	c20=letter	c21=arith	c22=letter	c23=EQUALS	c24=letter EOF
	-> 
	^(START 
		^($c03 ^($c01 $c00 $c02) $c04) 
		^($c13 ^($c11 $c10 $c12) $c14) 
		^($c23 ^($c21 $c20 $c22) $c24)
				
		^($e00 ^($a00 $c00 $c10) $c20) 
		^($e02 ^($a02 $c02 $c12) $c22) 
		^($e04 ^($a03 $c04 $c14) $c24)
	);
	

letter
	: SYMBOL+ -> ^(BLOCK SYMBOL+);

	
arith:	(PLUS|MINUS);
EQUALS:	'=';
PLUS:	'+';
MINUS:	'-';
SYMBOL:	'A'..'Z'|'a'..'z';
NEWLINE:	(('\r'? '\n') | '\r') {$channel=HIDDEN;} ;
WS:	( ' ' | '\t' | '\n') {$channel=HIDDEN;};