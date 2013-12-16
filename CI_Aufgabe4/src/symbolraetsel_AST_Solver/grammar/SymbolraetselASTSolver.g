tree grammar SymbolraetselASTSolver;

options {
 language=Java;
 tokenVocab = SymbolraetselASTNormalizer;
 output = template;
 ASTLabelType = CommonTree;
}

tokens {
 ADDITION;
}

@header {
package symbolraetsel_AST_Solver.grammar.output;

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;
}

@members {
Set<Character> symbols = new HashSet<Character>();
}


start :
	^(START constraints+=constraint*)
	-> sums(symbols={symbols},cons={$constraints});
 
constraint
@after {
Constraint constraint = new Constraint();
constraint.numbers.add($n1.number);
constraint.numbers.add($n2.number);
constraint.numbers.add($n3.number);
constraint.prepare();
} :
	^(EQUALS ^(ADDITION n1=number n2=number) n3=number) 
	-> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number});
 
 
number returns [Number number]
@after {
$number = new Number();
$number.setDigits($syms);
//HashSet um alle Smybole zu sammeln
symbols.addAll($number.getCharacters());
} :
	^(BLOCK syms+=SYMBOL+);
