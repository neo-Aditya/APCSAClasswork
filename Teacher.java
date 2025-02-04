public class Teacher extends Staff {
    private int experience;
    private String course;

    public void read(int code, String name, int experience, String course) {
        this.code = code;
        this.name = name;
        this.experience = experience;
        this.course = course;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience);
        System.out.println("Course: " + course);
    }
}
