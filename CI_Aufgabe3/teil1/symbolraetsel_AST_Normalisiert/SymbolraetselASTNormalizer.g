tree grammar SymbolraetselASTNormalizer;

options {
	tokenVocab=SymbolraetselAST;
	ASTLabelType = CommonTree;
	output=AST;
	}
	
tokens {
	EQUALS;
	ADDITION;
	LETTER;
	}
	
// applies only to the parser:
@header { package symbolraetsel_AST_Normalisiert.output;}

start	: redraw+;

redraw:	 ^(EQUALS ^(PLUS a=LETTER b=LETTER) c=LETTER)
	 	-> ^(EQUALS ^(ADDITION $a $b) $c)
	|^(EQUALS ^(MINUS a=LETTER b=LETTER) c=LETTER)
		-> ^(EQUALS ^(ADDITION $c $b) $a);

arith 	: PLUS | MINUS;
