public class Student {
    static int count = 0;

    Student() {
        count++;
    }

    public void display() {
        System.out.println("Count: " + count);
    }
}
