public class SchoolAdmin extends Staff {
    private int grade;
    private String department;

    public void read(int code, String name, int grade, String department) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Department: " + department);
    }
}
