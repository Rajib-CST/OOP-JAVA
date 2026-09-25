import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String emp1Name = scanner.nextLine();
        int emp1Salary = Integer.parseInt(scanner.nextLine());
        String emp2Name = scanner.nextLine();
        int emp2Salary = Integer.parseInt(scanner.nextLine());
        String subDeptName = scanner.nextLine();
        String emp3Name = scanner.nextLine();
        int emp3Salary = Integer.parseInt(scanner.nextLine());
        
        // Create the "Engineering" department as the root
        Department engineering = new Department("Engineering");
        
        // Create and add two employees to Engineering using emp1 and emp2 data
        Employee employee1 = new Employee(emp1Name, emp1Salary);
        Employee employee2 = new Employee(emp2Name, emp2Salary);
        engineering.add(employee1);
        engineering.add(employee2);
        
        // Create a sub-department using subDeptName
        Department subDept = new Department(subDeptName);
        
        // Create and add one employee to the sub-department using emp3 data
        Employee employee3 = new Employee(emp3Name, emp3Salary);
        subDept.add(employee3);
        
        // Add the sub-department to Engineering
        engineering.add(subDept);
        
        // Call showDetails("") on the Engineering department
        engineering.showDetails("");
        
        // Print the total salary in format: Total Salary: $[amount]
        System.out.println("Total Salary: $" + engineering.getSalary());
    }
}
