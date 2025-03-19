public class CircleVolume extends CircleArea {
     double volume = 0.0;

    @Override
    public void calculate() {
        super.calculate();
        volume = 4 * radius * radius * radius * Math.PI  / 3;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Area Is: ");
        System.out.println(volume);
    }
}
