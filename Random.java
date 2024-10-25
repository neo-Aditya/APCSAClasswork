import java.lang.Math;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the minimum possible integer?");
        int min = sc.nextInt();
        System.out.println("What is the maximum possible integer?");
        int max = sc.nextInt();
        int[] randomArray = generateRandom(min, max, 200);
        for (int i = 0; i < randomArray.length; i++) System.out.println(randomArray[i]);
        sc.close();
    }
    
    /**
     * @param min The minimum possible int that can be generated
     * @param max The maximum possible int that can be generated
     * @param numbersGenerated the amount of numbers to be generated
     * @return An array of randomly generated ints  
     */
    public static int[] generateRandom(int min, int max, int numbersGenerated) {
        int[] output = new int[numbersGenerated];
        if (max < min) {
            System.out.print("error");
            return output;
        }
        int range = max - min;
        range += (int)(Math.signum(range));
        for (int i = 0; i < output.length; i++) output[i] = (int)((Math.random() * range) + min);
        return output;
    }

    public static void whilePatternGame(Scanner sc) {
        int guess = 7;
        int number = generateRandom(1, 100, 1)[0];
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