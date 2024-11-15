import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int[] array = new int[sc.nextInt()];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();

        System.out.print("Sorted: \n");
        Sort.insertion(array);

        sc.close();
    }
}
