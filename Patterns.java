import java.util.Scanner;

public class Patterns implements AutoCloseable {
    private Scanner sc;
    private int nPatternOne = 0;
    private int nPatternTwo = 0;
    private double resultPatternOne;
    private double resultPatternTwo;
    public Patterns() {
        sc = new Scanner(System.in);
    }

    public void getInput() {
        System.out.println("What's n for pattern 1?");
        nPatternOne = sc.nextInt();
        System.out.println("What's n for pattern 2?");
        nPatternTwo = sc.nextInt();
    }

    public void close() throws Exception {
        sc.close();
        System.out.println(getClass() + " has been closed, this ain't complicated for CSP.");
    }

    public void patternOne() {
        resultPatternOne = 0;
        for (int i = 1; i <= nPatternOne; i++) {
            resultPatternOne += 1.0 / Calculator.factorialCalc(i);
        }
    }

    public void patternTwo() {
        resultPatternTwo = 0;
        for (int i = 1; i <= nPatternTwo; i++) {
            resultPatternTwo += i % 2 == 1 ?  1.0 / (i) : -1.0 / (i);
        }
    }

    public void displayPatterns() {
        System.out.println("Pattern 1 is " + resultPatternOne);
        System.out.println("Pattern 2 is " + resultPatternTwo);
    }
}
