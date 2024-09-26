import java.util.Scanner;

public class Employee {
    private Scanner sc;
    private int emp_id;
    private String emp_name; 
    private String designation;
    private int salary;
    public Employee() {
        sc = new Scanner(System.in);
    }

    public void getEmp() {
        System.out.print("What's your name? ");
        emp_name = sc.nextLine();
        System.out.print("What's your designation? ");
        designation = sc.nextLine();
        System.out.print("What's your id? ");
        emp_id = sc.nextInt();
        System.out.print("What's your salary in US Dollars? ");
        salary = sc.nextInt();
    }
    
    public void showGrade() {
        if (salary <= 24997) {
            System.out.println(salary < 10000 ? "D" : "C");
            return;
        }
        if (salary >= 25000) {
            System.out.println(salary > 50000 ? "A" : "B");
            return;
        }
        System.out.println("N/A");
    }

    public void showEmp() {
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary );
        System.out.print("Grade: ");
        showGrade();
    }

}
