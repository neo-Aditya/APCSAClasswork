

public class Main {
    public static void main(String[] args) {
        EquationSolver eq = new EquationSolver(0.000001);
        System.out.println(eq.solve(new Fun(), 0, 10));
    }
}
