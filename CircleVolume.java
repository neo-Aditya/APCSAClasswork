public class CircleVolume extends Circle {
    protected double volume = 0.0;

    public void calculateVolume() {
        volume = 4 * radius * radius * radius * Math.PI  / 3;
    }

    public void displayVolume() {
        System.out.println(volume);
    }
}
