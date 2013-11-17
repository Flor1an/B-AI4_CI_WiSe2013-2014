package teil2_ChocoConstraintSolver;
import choco.cp.model.CPModel;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.Choco;
import choco.Options;
import choco.kernel.solver.Solver;
import choco.cp.solver.CPSolver;


public class DonaldGeraldRobert {
	public static void main(String[] args) {
		// Build model
		Model model = new CPModel();
		// Declare every letter as a variable
		IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
		IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
		IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
		IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
		IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
		IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
		IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
		IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
		IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
		IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
		IntegerVariable c1 = Choco.makeIntVar("C1", 0, 1, Options.V_ENUM); //Carry 1
		IntegerVariable c2 = Choco.makeIntVar("C2", 0, 1, Options.V_ENUM); //Carry 2
		IntegerVariable c3 = Choco.makeIntVar("C3", 0, 1, Options.V_ENUM); //Carry 3
		IntegerVariable c4 = Choco.makeIntVar("C4", 0, 1, Options.V_ENUM); //Carry 4
		IntegerVariable c5 = Choco.makeIntVar("C5", 0, 1, Options.V_ENUM); //Carry 5

	
		/**
		 * +   D  O  N  A  L  D
		 * +   G  E  R  A  L  D
		 * +  C5 C4 C3 C2 C1  
		 *=====================
		 *     R  O  B  E  R  T
		 */

		model.addConstraint(Choco.allDifferent(new IntegerVariable[]{d,o,n,a,l,g,e,r,b,t}));
		
		model.addConstraint(Choco.eq(Choco.plus(d, d), Choco.plus(t, Choco.mult(10, c1))));
		
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c1, l), l), Choco.plus(r, Choco.mult(10, c2))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c2, a), a), Choco.plus(e, Choco.mult(10, c3))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c3, n), r), Choco.plus(b, Choco.mult(10, c4))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c4, o), e), Choco.plus(o, Choco.mult(10, c5))));

		//model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c5, d), g), Choco.plus(r, Choco.mult(10, null))));
		

		
		Solver solver = new CPSolver();
		solver.read(model);
		solver.solveAll();
		
		
		IntegerVariable[] donald = {d,o,n,a,l,d}; 
		for (IntegerVariable letter : donald) {
			System.out.print(solver.getVar(letter) + " ");
		}
		System.out.println();
		
		IntegerVariable[] gerald = {g,e,r,a,l,d}; 
		for (IntegerVariable letter : gerald) {
			System.out.print(solver.getVar(letter) + " ");
		}
		
		System.out.println();
		IntegerVariable[] robert = {r,o,b,e,r,t}; 
		for (IntegerVariable letter : robert) {
			System.out.print(solver.getVar(letter) + " ");
		}
	
	}
}
