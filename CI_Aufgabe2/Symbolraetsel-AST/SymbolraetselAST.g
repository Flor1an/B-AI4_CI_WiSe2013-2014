grammar SymbolraetselAST;

options {output=AST;} // build trees
tokens {
  HORIZONTAL;
  VERTIKAL;
}

start 		:c00=LETTER  	ARITME	c01=LETTER		EQUALS	c02=LETTER
		 a00=ARITME  		a01=ARITME			a02=ARITME
		 c10=LETTER  	ARITME	c11=LETTER		EQUALS	c12=LETTER
		 e00=EQUALS 		e01=EQUALS			e02=EQUALS
		 c20=LETTER  	ARITME	c21=LETTER		EQUALS	c22=LETTER
		  ->	
		  	^(HORIZONTAL 
				 ^(EQUALS ^(ARITME $c00 $c01) $c02)
				 ^(EQUALS ^(ARITME $c10 $c11) $c12)
				 ^(EQUALS ^(ARITME $c20 $c21) $c22)
			 )
			 ^(VERTIKAL
				 ^(EQUALS ^($a00 $c00 $c10) $c20)
				 ^(EQUALS ^($a01 $c01 $c11) $c21)
				 ^(EQUALS ^($a02 $c02 $c12) $c22)
			 );



SPACE		: ' ' {skip();};
LINEBREAK		: '\r'? '\n' {$channel=HIDDEN;};
LETTER		: 'A'..'Z'+;
ARITME		: '+'|'-';
EQUALS		: '=';