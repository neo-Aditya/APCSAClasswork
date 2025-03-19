public class EquationSolver {
    private final double prec;

    public EquationSolver(double prec) {
        this.prec = prec;
    }

    public double solve(Fun fun, double a, double b) {
        double m = (a + b) / 2;
        if (b - a < prec) return m;
        if (fun.f(m) < 0) return solve(fun, m, b);
        return solve(fun, a, m);
    }
}
