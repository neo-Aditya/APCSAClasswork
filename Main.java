import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        try {
            FourDigitInteger num = new FourDigitInteger(sc.nextInt());
            System.out.println("Is Odd: ");
            System.out.println(num.isOdd());

            System.out.println("Is Palindrome: ");
            System.out.println(num.isPalindrome());

            System.out.println("Is Perfect Square: ");
            System.out.println(num.isPerfectSquare());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        

        sc.close();
    }
}
