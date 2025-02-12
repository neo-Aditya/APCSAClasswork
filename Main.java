
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the radius?");
        CircleVolume circle= new CircleVolume();
        circle.setRadius(sc.nextDouble());
        System.out.print("Area is: ");
        circle.calculate();
        circle.display();

        System.out.println("\n");

        Admin a = new Admin(2, "Daniel", 0, 73);
        a.read(2, "Daniel", 0, 73);
        a.display();

        System.out.println("\n");

        Teacher t = new Teacher();
        t.read(1, "Ms. Michael", 3, "Computer Science");
        t.display();
    }
}
