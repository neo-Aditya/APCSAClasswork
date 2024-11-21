import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int rows1 = sc.nextInt();

        System.out.println("Columns:");
        int[][] array1 = new int[rows1][sc.nextInt()];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Entered: ");
        Arrays.printElements2d(array1);

        System.out.println("Transposed: ");
        Arrays.printElements2d(Arrays.transpose2d(array1));

        System.out.println("Top Left Diagonal Sums: " + Arrays.sumOfTopDiags(array1, true));

        System.out.println("Top Right Diagonal Sums: " + Arrays.sumOfTopDiags(array1, false));

        System.out.print("Row Sums: ");
        Arrays.printElements(Arrays.rowSums(array1));

        System.out.print(" \nColumn Sums: ");
        Arrays.printElements(Arrays.columnSums(array1));

        System.out.println("\nRows: ");
        int rows2 = sc.nextInt();

        System.out.println("Columns:");
        int[][] array2 = new int[rows2][sc.nextInt()];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplied Matrix: ");
        Arrays.printElements2d(Arrays.matrixMultiplication(array1, array2));

        sc.close();
    }
}
