import java.util.Scanner;

class Employee {
    private String name;
    private int baseSalary;
    public Employee(String name, int baseSalary) { this.name = name; this.baseSalary = baseSalary; }
    public String getName() { return this.name; }
    public int getBaseSalary() { return this.baseSalary; }
    public String describe() { return "Employee: " + this.name; }
    public String getPaySummary() { return this.name + ": base $" + this.baseSalary; }
}

class Manager extends Employee {
    private int bonus;
    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    public String describe() { return super.describe() + " (Manager)"; }
    public String getPaySummary() {
        int total = getBaseSalary() + this.bonus;
        return super.getPaySummary() + ", bonus $" + this.bonus + ", total $" + total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int baseSalary = Integer.parseInt(sc.nextLine());
        int bonus = Integer.parseInt(sc.nextLine());
        Manager m = new Manager(name, baseSalary, bonus);
        System.out.println(m.describe());
        System.out.println(m.getPaySummary());
    }
}
