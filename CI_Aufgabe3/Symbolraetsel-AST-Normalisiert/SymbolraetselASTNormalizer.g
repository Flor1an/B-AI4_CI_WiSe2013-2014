tree grammar SymbolraetselASTNormalizer;

options {
	tokenVocab=SymbolraetselAST;
	ASTLabelType = Tree;
	output=AST;
	}
	
tokens {
	EQUALS;
	ADDITION;
	LETTER;
	}

start	: redraw+;

redraw:	 ^(EQUALS ^(PLUS a=LETTER b=LETTER) c=LETTER)
	 	-> ^(EQUALS ^(ADDITION $a $b) $c)
	|^(EQUALS ^(MINUS a=LETTER b=LETTER) c=LETTER)
		-> ^(EQUALS ^(ADDITION $c $b) $a);

arith 	: PLUS | MINUS;
