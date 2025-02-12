public class CircleArea extends CircleCreator {
    protected double area = 0.0;

    public void calculate() {
        area = Math.PI * radius * radius;
    }

    public void display() {
        System.out.print("Area Is: ");
        System.out.println(area);
    }
}
