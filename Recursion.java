public class Recursion {
    public static int getFactorial(int target) {
        if (target <= 1) return target;
        return target * getFactorial(target - 1);
    }

    public static int getExponent(int base, int power) {
        if (power == 1) return base;
        return base * getExponent(base, power -1);
    }

    public static void displayFibonacci(int elements, int previousVal, int currentVal) {
        if (elements == 0) return;

        System.out.print(currentVal + ", ");
        displayFibonacci(--elements, currentVal, currentVal + previousVal);
    }
}
