import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Q would you like to answer?");
        int programNumber = sc.nextInt();
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(programNumber == 1) System.out.println(factorialCalc(n));
        else if(programNumber == 2) {
            long[] firstOdds = firstOdds(n);
            for (int i = 0; i < firstOdds.length; i++) {
                System.out.println(firstOdds[i]);
            }
        }
        else if(programNumber == 3) {
            long[] oddsTill = oddsTill(n);
            for (int i = 0; i < oddsTill.length; i++) {
                System.out.println(oddsTill[i]);
            }
        }
        else if(programNumber == 4) System.out.println(firstNaturalSum(n));
        else if(programNumber == 5) {
            long[] firstFibonacci = firstFibonacci(n);
            for (int i = 0; i < firstFibonacci.length; i++) {
                System.out.println(firstFibonacci[i]);
            }
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();

    }

    public static long factorialCalc(long n) {
        if (n <= 0) return 1;
        long output = 1;
        for (long i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static long[] firstOdds(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[n];
        output[0] = 1L;
        for(int i = 1; i < n ; i++) {
            output[i] = output[i - 1] + 2;
        }
        return output;
    }

    public static long[] oddsTill(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[(n / 2) + n % 2];
        output[0] = 1L;
        for(int i = 1; i < n ; i++) {
            output[i] = output[i - 1] + 2;
        }
        return output;
    }

    public static long firstNaturalSum(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long[] firstFibonacci(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[n];
        output[0] = 0L;
        output[1] = 1L;
        for(int i = 2; i < n ; i++) {
            output[i] = output[i - 1] + output[i - 2];
        }
        return output;
    }
}