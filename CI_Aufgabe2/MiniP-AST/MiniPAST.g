grammar MiniPAST;

options {output=AST;} // build trees
tokens {
  VAR;   // variable definition
  DECL;
  FUNC;  // function definition
  SLIST; // statement list
  READ;
  PRINT;
}
start		:program;

// LEXER & token

COMMENT 		: '/*' .* '*/' {$channel=HIDDEN;};
WHITESPACE 	: (' ' | '\r' | '\n' | '\t')+{$channel=HIDDEN;};

fragment CHAR 	: ('A'..'Z')|('a'..'z');
fragment DIGIT 	: ('0'..'9');
fragment UNDERSCORE 	: '_';
INTEGER 		: DIGIT+;
REAL 		: DIGIT+ '.' DIGIT+;
STRING 		: '"' .* '"';
BOOLEAN 		: 'true' | 'false';
COMPARE 		: ('<>' | '<' | '<=' | '=>'| '>');
datatype 		: ('integer'|'real'|'string'|'boolean');
ID 		: CHAR (CHAR | DIGIT | UNDERSCORE)*;

// Struktur
program 		:'program' declaration* 'begin'  statement+ 'end' -> ^(DECL declaration*) ^(FUNC statement+);
	
// Deklaration
declaration 		: datatype  ID (','  ID)* ';'  -> ^(VAR datatype  ID);

// Statement
statement 		:(((assignmentStatement | ifStatement | whileStatement | readStatement | printStatement) sym | COMMENT) ) ;
sym		:';' -> ;
block		: statement+ -> ^(SLIST statement+);

// Assignment
assignmentStatement 	: ID  ':='^ (arithStatement | STRING  | compareStatement);

// if
ifStatement 		: 'if'  compareStatement  'then'  block ('else'  block)? 'fi' -> ^('if' compareStatement block);

// while
whileStatement 	: 'while'  compareStatement  'do'  block  'od' -> ^('while' compareStatement block);


// read
readStatement 	: 'read(' ID ')' -> ^(READ ID);

// print
printStatement 	: 'println(' printContent ')' -> ^(PRINT printContent);
printContent		: ID | STRING;

// arith.Ausdruck
arithStatement 	: factor (('+'^|'-'^) factor)* ;
factor		: atom (('*'^|'/'^) atom)*;
atom 		: '-'?(INTEGER | REAL | ID | '(' arithStatement ')');

// Vergleich
compareStatement 	: BOOLEAN | (ID  COMPARE^  ID) | (konstant  COMPARE^  konstant);
konstant 		: INTEGER | REAL | STRING | BOOLEAN;

