package symbolraetsel_AST_Solver;
import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.common.logging.ChocoLogging;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class ChocoSolver { 
	public static void main(String[] args) {
		Model model = new CPModel();
	 	
	 	//Variablen Definition, jedes Symbol eine Variable
		IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM);

		IntegerVariable E = Choco.makeIntVar("E", 0, 9, Options.V_ENUM);

		IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM);

		IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM);

		IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM);

		IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM);

		IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM);


		
		//Carry auf 0 setzen für den Anfang
		IntegerExpressionVariable carry = Choco.constant(0);
		
		//Constraint, dass alle Symbole verschieden sein müssen
		model.addConstraint(Choco.allDifferent(D, E, F, G, A, B, C));
		
		//Constrains aus den Aufgaben 


		carry = Choco.sum(C,E,Choco.div(carry,10));
		model.addConstraint(Choco.eq(F,Choco.mod(carry,10)));
		carry = Choco.sum(B,D,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.sum(A,D,Choco.div(carry,10));
		model.addConstraint(Choco.eq(F,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(B,E,Choco.div(carry,10));
		model.addConstraint(Choco.eq(A,Choco.mod(carry,10)));
		carry = Choco.sum(C,G,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.sum(Choco.constant(0),B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(E,G,Choco.div(carry,10));
		model.addConstraint(Choco.eq(E,Choco.mod(carry,10)));
		carry = Choco.sum(E,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(A,Choco.mod(carry,10)));
		carry = Choco.sum(A,C,Choco.div(carry,10));
		model.addConstraint(Choco.eq(G,Choco.mod(carry,10)));
		carry = Choco.sum(Choco.constant(0),Choco.constant(0),Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(C,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(E,Choco.mod(carry,10)));
		carry = Choco.sum(B,C,Choco.div(carry,10));
		model.addConstraint(Choco.eq(E,Choco.mod(carry,10)));
		carry = Choco.sum(A,Choco.constant(0),Choco.div(carry,10));
		model.addConstraint(Choco.eq(A,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(E,E,Choco.div(carry,10));
		model.addConstraint(Choco.eq(G,Choco.mod(carry,10)));
		carry = Choco.sum(D,G,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.sum(D,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(F,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(E,Choco.mod(carry,10)));
		carry = Choco.sum(C,C,Choco.div(carry,10));
		model.addConstraint(Choco.eq(A,Choco.mod(carry,10)));
		carry = Choco.sum(F,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(G,Choco.mod(carry,10)));
		carry = Choco.sum(Choco.constant(0),Choco.constant(0),Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);
		
		//Solver zum Lösen des Rätsels erstellen
		Solver s = new CPSolver();
		s.read(model);
		ChocoLogging.toSolution();
		s.solve();
		
		//Lösung ausgeben	
		System.out.println(s.solutionToString());

	}
}