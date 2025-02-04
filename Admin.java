public class Admin extends Account {
 private int exp;

    public Admin(int code, String name, int salary, int exp) {
        super(code, name, salary);
        this.exp = exp;
    }

    public void read(int code, String name, int salary, int exp) {
        this.code = code;
        this.name = name;
        this. salary = salary;
        this.exp = exp;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Exp: " + exp);
    }
}
