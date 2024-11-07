public class ClassExample {
    static int count = 0;

    ClassExample() {
        count++;
    }

    public void display() {
        System.out.println("Count: " + count);
    }
}
