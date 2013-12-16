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
		IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM);
		IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM);

		
		//Carry auf 0 setzen für den Anfang
		IntegerExpressionVariable carry = Choco.constant(0);
		
		//Constraint, dass alle Symbole verschieden sein müssen
		model.addConstraint(Choco.allDifferent(D, A, C));
		
		//Constrains aus den Aufgaben 


		 //A + A = D
		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		 //A + A = D
		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		 //D + D = C
		carry = Choco.sum(D,D,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		 //A + A = D
		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		 //A + A = D
		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(D,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		 //D + D = C
		carry = Choco.sum(D,D,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
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