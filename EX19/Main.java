import java.util.Scanner;

class Employee {
    private String ssn;
    String department;
    protected String role;
    public String company;

    public Employee(String ssn, String department, String role, String company) {
        this.ssn = ssn;
        this.department = department;
        this.role = role;
        this.company = company;
    }

    public String getBadge() {
        String last4 = this.ssn.substring(this.ssn.length() - 4);
        return this.company + ": " + this.role + " (" + this.department + ") SSN ***-**-" + last4;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();
        String department = sc.nextLine();
        String role = sc.nextLine();
        String company = sc.nextLine();

        Employee emp = new Employee(ssn, department, role, company);
        System.out.println(emp.company);
        System.out.println(emp.getBadge());
    }
}
