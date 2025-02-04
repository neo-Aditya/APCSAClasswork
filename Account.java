public class Account extends Person {
    protected int salary;
    public Account(int code, String name, int salary) {
        super(code, name);
        this.salary = salary;
    }

}
