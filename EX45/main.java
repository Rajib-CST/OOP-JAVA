import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) { this.name = name; this.salary = salary; }
    public double getSalary() { return this.salary; }
    public String describe() { return this.name + " earns " + this.salary; }
}

class Intern extends Employee {
    private double stipend;
    public Intern(String name, double stipend) { super(name, 0); this.stipend = stipend; }
    @Override
    public String describe() { return this.name + " is an intern earning a stipend of " + this.stipend; }
}

class Manager extends Employee {
    protected int teamSize;
    public Manager(String name, double salary, int teamSize) { super(name, salary); this.teamSize = teamSize; }
    public double bonus() { return this.teamSize * 100.0; }
}

class Director extends Manager {
    private int regions;
    public Director(String name, double salary, int teamSize, int regions) { super(name, salary, teamSize); this.regions = regions; }
    public double totalCompensation() { return this.getSalary() + this.bonus() + this.regions * 500.0; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Intern intern = new Intern(sc.nextLine(), Double.parseDouble(sc.nextLine()));
        Manager manager = new Manager(sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        Director director = new Director(sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        System.out.println(intern.describe());
        System.out.println(manager.describe() + ", bonus " + manager.bonus());
        System.out.println(director.describe() + ", total compensation " + director.totalCompensation());
    }
}
