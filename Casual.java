public class Casual extends Typist {
    protected int wage;

    public void read(int code, String name, int speed, int experience, int wage) {
        this.code = code;
        this.name = name;
        this.speed = speed;
        this.experience = experience;
        this.wage = wage;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Experience: " + experience);
        System.out.println("Wage: " + wage);
    }
}
