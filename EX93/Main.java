import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String newAppName = scanner.nextLine();
        int newMaxUsers = scanner.nextInt();
        
        // Get first instance of AppConfig and store in config1
        AppConfig config1 = AppConfig.getInstance();
        
        // Call displaySettings() on config1 to show default values
        config1.displaySettings();
        
        // Update settings using setAppName and setMaxUsers on config1
        config1.setAppName(newAppName);
        config1.setMaxUsers(newMaxUsers);
        
        // Get another instance and store in config2
        AppConfig config2 = AppConfig.getInstance();
        
        // Call displaySettings() on config2 to prove changes are shared
        config2.displaySettings();
        
        // Print whether both references point to same object
        System.out.println("Same instance: " + (config1 == config2));
    }
}
