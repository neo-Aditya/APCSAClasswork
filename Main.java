import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int[] array = new int[sc.nextInt()];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();

        System.out.print("Contents of Array: ");
        Arrays.printElements(array);

        System.out.println("\n Which number to look for?");
        int target = sc.nextInt();
        System.out.print(target);
        if (Arrays.isInArray(array, target)) System.out.println(" is in the array");
        else System.out.println(" is NOT in the array");

        System.out.print("Location/s: ");
        Arrays.displayIndexof(array, target);

        System.out.println("Standard Deviation: " + Arrays.getStandardDeviation(array));
        System.out.println("Max Value: " + Arrays.getMax(array));
        System.out.println("Min Value: " + Arrays.getMin(array));

        System.out.println("Reversed: ");
        int[] reverse = Arrays.getReverse(array);
        boolean firstPrinted = false;
        for (int value : reverse) {
            if (firstPrinted) System.out.print(", ");
            else firstPrinted = true;
            System.out.print(value);
        }

        sc.close();
    }
}
