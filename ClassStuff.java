import java.util.Scanner;

public class ClassStuff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] k = new int[sc.nextInt()];

        for (int i = 0; i < k.length; i++) k[i] = sc.nextInt();
        for (int i : k) System.out.println(i);
        sc.close();
    }
}
