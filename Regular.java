public class Regular extends Typist {
    protected int salary;

    public void read(int code, String name, int speed, int experience, int salary) {
        this.code = code;
        this.name = name;
        this.speed = speed;
        this.experience = experience;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
    }
}
