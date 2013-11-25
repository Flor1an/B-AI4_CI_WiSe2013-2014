grammar SymbolraetselAST;

options {
	output=AST;
	ASTLabelType = CommonTree;
	}
	
tokens {
	PLUS;
	MINUS;
	}

// applies only to the parser:
@header { package symbolraetsel_AST_Normalisiert.output;}
 
// applies only to the lexer:
@lexer::header { package symbolraetsel_AST_Normalisiert.output;}

start:	c00=LETTER	c01=arith	c02=LETTER	c03=EQUALS	c04=LETTER
	a00=arith		a02=arith     		a03=arith
	c10=LETTER	c11=arith 	c12=LETTER	c13=EQUALS	c14=LETTER
	e00=EQUALS		e02=EQUALS		e04=EQUALS
	c20=LETTER	c21=arith	c22=LETTER	c23=EQUALS	c24=LETTER EOF
	-> 
	^($c03 ^($c01 $c00 $c02) $c04) 
	^($c13 ^($c11 $c10 $c12) $c14) 
	^($c23 ^($c21 $c20 $c22) $c24)
			
	^($e00 ^($a00 $c00 $c10) $c20) 
	^($e02 ^($a02 $c02 $c12) $c22) 
	^($e04 ^($a03 $c04 $c14) $c24);


SPACE	:' ' {skip();};
LINEBREAK:	'\r'? '\n' {$channel=HIDDEN;};
LETTER:	'A'..'Z'+;
arith:	PLUS|MINUS;
PLUS:	'+';
MINUS:	'-';
EQUALS:	'=';
