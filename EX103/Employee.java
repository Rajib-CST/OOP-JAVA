public class Employee implements OrganizationComponent {
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void showDetails(String indent) {
        System.out.println(indent + name + ": $" + salary);
    }
    
    public int getSalary() {
        return salary;
    }
}
 

