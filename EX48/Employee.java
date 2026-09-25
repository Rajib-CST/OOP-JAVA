// Base class for all employees
class Employee {
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getDetails() {
        return name + " earns $" + String.format("%.2f", salary);
    }
    
    public void work() {
        System.out.println(name + " is working");
    }
}
