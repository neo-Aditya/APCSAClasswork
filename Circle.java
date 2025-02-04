public class Circle extends CircleCreator {
    protected double area = 0.0;

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println(area);
    }
}
