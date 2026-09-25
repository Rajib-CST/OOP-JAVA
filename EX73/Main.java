import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three employees from input
        // Each line format: name,department,salary
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        
        // Parse each line and create Employee objects
        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");
        
        Employee emp1 = new Employee(parts1[0], parts1[1], Double.parseDouble(parts1[2]));
        Employee emp2 = new Employee(parts2[0], parts2[1], Double.parseDouble(parts2[2]));
        Employee emp3 = new Employee(parts3[0], parts3[1], Double.parseDouble(parts3[2]));
        
        // Create an ArrayList of employees and add all three
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        // Sort by salary using SalaryComparator and print each employee
        Collections.sort(employees, new SalaryComparator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
        // Print an empty line
        System.out.println();
        
        // Sort by name using NameComparator and print each employee
        Collections.sort(employees, new NameComparator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
