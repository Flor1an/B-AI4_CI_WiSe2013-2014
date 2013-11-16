import choco.cp.model.CPModel;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.Choco;
import choco.Options;
import choco.kernel.solver.Solver;
import choco.cp.solver.CPSolver;

public class SendMoreMoney {
	public static void main(String[] args) {
		// Build model
		Model model = new CPModel();
		// Declare every letter as a variable
		IntegerVariable s = Choco.makeIntVar("S", 0, 9, Options.V_ENUM);
		IntegerVariable e = Choco.makeIntVar("E", 0, 9, Options.V_ENUM);
		IntegerVariable n = Choco.makeIntVar("N", 0, 9, Options.V_ENUM);
		IntegerVariable d = Choco.makeIntVar("D", 0, 9, Options.V_ENUM);
		IntegerVariable m = Choco.makeIntVar("M", 0, 9, Options.V_ENUM);
		IntegerVariable o = Choco.makeIntVar("O", 0, 9, Options.V_ENUM);
		IntegerVariable r = Choco.makeIntVar("R", 0, 9, Options.V_ENUM);
		IntegerVariable y = Choco.makeIntVar("Y", 0, 9, Options.V_ENUM);
		IntegerVariable c1 = Choco.makeIntVar("C1", 0, 1, Options.V_ENUM);
		IntegerVariable c2 = Choco.makeIntVar("C2", 0, 1, Options.V_ENUM);
		IntegerVariable c3 = Choco.makeIntVar("C3", 0, 1, Options.V_ENUM);

	
		/**
		 * +   S  E  N  D
		 * +   M  O  R  E
		 * +  C3 C2 C1  
		 *===============
		 *  M  O  N  E  Y
		 */

		model.addConstraint(Choco.allDifferent(new IntegerVariable[]{s,e,n,d,m,o,r,y}));
		
		model.addConstraint(Choco.eq(Choco.plus(e, d), Choco.plus(y, Choco.mult(10, c1))));
		
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c1, n), r), Choco.plus(e, Choco.mult(10, c2))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c2, e), o), Choco.plus(n, Choco.mult(10, c3))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(c3, s), m), Choco.plus(o, Choco.mult(10, m))));
		

		
		Solver solver = new CPSolver();
		solver.read(model);
		solver.solveAll();
		
		
		IntegerVariable[] send = {s,e,n,d}; 
		for (IntegerVariable letter : send) {
			System.out.print(solver.getVar(letter) + " ");
		}
		System.out.println();
		
		IntegerVariable[] more = {m,o,r,e}; 
		for (IntegerVariable letter : more) {
			System.out.print(solver.getVar(letter) + " ");
		}
		
		System.out.println();
		IntegerVariable[] money = {m,o,n,e,y}; 
		for (IntegerVariable letter : money) {
			System.out.print(solver.getVar(letter) + " ");
		}
	
	}
}
