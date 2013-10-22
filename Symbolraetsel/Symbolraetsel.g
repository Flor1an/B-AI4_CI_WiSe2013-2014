grammar Symbolraetsel;

SPACE				: ' ' {$channel=HIDDEN;};
LINEBREAK		: '\r'? '\n';
LETTER			: 'A'..'Z';
ARITMETIC_SIGN	: '+'|'-';
EQUALS_SIGN		: '=';

buschstaben : LETTER+;
expression		: buschstaben SPACE? ARITMETIC_SIGN SPACE? buschstaben SPACE? EQUALS_SIGN SPACE? buschstaben;

first_row 		: expression LINEBREAK;
second_row		: ARITMETIC_SIGN SPACE? ARITMETIC_SIGN SPACE? ARITMETIC_SIGN LINEBREAK;
third_row		: expression LINEBREAK;
fourth_row		: EQUALS_SIGN SPACE? EQUALS_SIGN SPACE? EQUALS_SIGN LINEBREAK;
fifth_row		: expression LINEBREAK?;

start				: first_row second_row third_row fourth_row fifth_row;