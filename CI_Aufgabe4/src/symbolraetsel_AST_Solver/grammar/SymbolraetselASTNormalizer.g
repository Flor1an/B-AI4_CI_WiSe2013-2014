tree grammar SymbolraetselASTNormalizer;


options {
  	language = Java;
  	output=AST;
	tokenVocab = SymbolraetselAST;
	ASTLabelType = CommonTree;
} 

tokens {
 ADDITION;
}

@header {
package symbolraetsel_AST_Solver.grammar.output;
}

start	: ^(START redraw+);

redraw:	 ^(EQUALS ^( a=num b=num) c=num)
	 	-> ^(EQUALS ^(ADDITION $a $b) $c)
	|^(EQUALS ^(MINUS a=num b=num) c=num)
		-> ^(EQUALS ^(ADDITION $c $b) $a);


num : ^(BLOCK SYMBOL+);
