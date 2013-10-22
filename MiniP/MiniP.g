grammar MiniP;

// LEXER & token

COMMENT : '/*' .* '*/' {$channel=HIDDEN;};
WHITESPACE : (' ' | '\r' | '\n' | '\t')+{$channel=HIDDEN;};

fragment CHAR : ('A'..'Z')|('a'..'z');
fragment DIGIT : ('0'..'9');
fragment UNDERSCORE : '_';
INTEGER : DIGIT+;
REAL : DIGIT+ '.' DIGIT+;
STRING : '"' .* '"';
BOOLEAN : 'true' | 'false';
COMPARE : ('<>' | '<' | '<=' | '=>'| '>');
DATATYPE : ('integer'|'real'|'string'|'boolean');
ID : CHAR (CHAR | DIGIT | UNDERSCORE)*;

// Struktur
program :	'program' declaration* 'begin'  statement+ 'end';
	
// Deklaration
declaration : DATATYPE  ID (','  ID)* ';' ;

// Statement
statement : (((assignmentStatement | ifStatement | whileStatement | readStatement | printStatement) ';' | COMMENT) );

// Assignment
assignmentStatement : ID  ':='  (arithStatement | STRING  | compareStatement);

// if
ifStatement : 'if'  compareStatement  'then'  statement+ ('else'  statement+)? 'fi';

// while
whileStatement : 'while'  compareStatement  'do'  statement+ 'od';

// read
readStatement : 'read(' ID ')';

// print
printStatement : 'println(' (ID | STRING) ')';

// arith.Ausdruck
arithStatement : factor (('+'|'-') factor)*;
factor: atom (('*'|'/') atom)*;
atom : '-'?(INTEGER | REAL | ID | '(' arithStatement ')');

// Vergleich
compareStatement : BOOLEAN | (ID  COMPARE  ID) | (konstant  COMPARE  konstant);
konstant : INTEGER | REAL | STRING | BOOLEAN;
