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

    public void nestedForPatternOne(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void nestedForPatternTwo(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = numberOfLines; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void nestedForPatternThree(int numberOfLines) {
        int top = numberOfLines/2;
        int bot = numberOfLines-top;
        for (int i = 0; i <= top; i++) {
            for (int j = i; j < bot; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = bot; i > 0; i--) {
            for (int j = i; j < bot; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void nestedForPatternFour(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 1; j < (numberOfLines - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void nestedForPatternFive(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 1; j < (numberOfLines - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char)(j + 64) + " ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
    public void nestedForPatternSix(int numberOfLines) {
        int num = 1;
        for (int i = 1; i <= numberOfLines; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public void whilePatternOne(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
    public void whilePatternTwo(int n) {
        int numberOfDigits = 0;
        while (n != 0) {
            numberOfDigits++;
            n /= 10;
        }
        System.out.println(numberOfDigits);
    }
    public void whilePatternThree(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }
    public void whilePatternFour(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (int)Math.pow(n % 10, 3);
            n /= 10;
        }
        System.out.println(sum);
    }
    public void whilePatternFive(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        while (reversedNumber != 0) {
            System.out.print(reversedNumber % 10 + " ");
            reversedNumber /= 10;
        }
    }
    public void whilePatternSix(Scanner sc) {
        int guess = 7;
        int number = (int)((Math.random() * 100) + 1);
        while (guess > 0) {
            int input = sc.nextInt();
            if (input > number) {
                System.out.println("Your guess was too high!");
                guess = guess - 1;
                System.out.println("You have " + guess + " guesses left!");
            }
            else if (input < number) {
                System.out.println("Your guess was too low!");
                guess = guess - 1;
                System.out.println("You have " + guess + " guesses left!");
            }
            else {
                System.out.println("You guessed the number!");
                guess = 8 - guess;
                System.out.println("You guessed the number in " + guess + " guesses!");
                guess = guess - 100;
            }
        }
    }
}
