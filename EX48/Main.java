import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String developerName = scanner.nextLine();
        String language = scanner.nextLine();
        
        // Developer salary is fixed at 75000.0
        double developerSalary = 75000.0;
        
        Manager manager = new Manager(managerName, managerSalary, teamSize);
        
        Developer developer = new Developer(developerName, developerSalary, language);
        
        System.out.println(manager.getManagerDetails());
        
        manager.work();
        
        System.out.println(developer.getDeveloperDetails());
        
        developer.work();
    }
}
