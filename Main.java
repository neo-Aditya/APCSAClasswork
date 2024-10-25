import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patterns patterns = new Patterns();

        System.out.println("How many lines?");
        int input = sc.nextInt();

        patterns.nestedForPatternOne(input);

        System.out.println("\n");
        patterns.nestedForPatternTwo(input);

        System.out.println("\n");
        patterns.nestedForPatternThree(input);

        System.out.println("\n");
        patterns.nestedForPatternFour(input);

        System.out.println("\n");
        patterns.nestedForPatternFive(input);

        System.out.println("\n");
        patterns.nestedForPatternSix(input);

        System.out.println(" \n What number?");
        input = sc.nextInt();

        System.out.print("\n Sum of Digits: ");
        patterns.whilePatternOne(input);
        
        System.out.print("\n Number of Digits: ");
        patterns.whilePatternTwo(input);

        System.out.print("\n Reverse: ");
        patterns.whilePatternThree(input);

        System.out.print("\n Sum of the Cube of Digits: ");
        patterns.whilePatternFour(input);

        System.out.print("\n Reverse, but with spaces: ");
        patterns.whilePatternFive(input);

        System.out.println("\n Random Game:");
        Random.whilePatternGame(sc);
    }
}
