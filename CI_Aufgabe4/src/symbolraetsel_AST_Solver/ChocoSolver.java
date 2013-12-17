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
		IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM);

		IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM);

		IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM);

		IntegerVariable X = Choco.makeIntVar("X", 0, 9, Options.V_ENUM);

		IntegerVariable Z = Choco.makeIntVar("Z", 0, 9, Options.V_ENUM);


		
		//Carry auf 0 setzen für den Anfang
		IntegerExpressionVariable carry = Choco.constant(0);
		
		//Constraint, dass alle Symbole verschieden sein müssen
		model.addConstraint(Choco.allDifferent(A, B, C, X, Z));
		
		//Constrains aus den Aufgaben 


		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.sum(Choco.constant(0),Z,Choco.div(carry,10));
		model.addConstraint(Choco.eq(X,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(B,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(A,A,Choco.div(carry,10));
		model.addConstraint(Choco.eq(B,Choco.mod(carry,10)));
		carry = Choco.sum(Z,Choco.constant(0),Choco.div(carry,10));
		model.addConstraint(Choco.eq(0,Choco.mod(carry,10)));
		carry = Choco.constant(0);

		carry = Choco.sum(B,B,Choco.div(carry,10));
		model.addConstraint(Choco.eq(C,Choco.mod(carry,10)));
		carry = Choco.sum(X,Choco.constant(0),Choco.div(carry,10));
		model.addConstraint(Choco.eq(0,Choco.mod(carry,10)));
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