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
}