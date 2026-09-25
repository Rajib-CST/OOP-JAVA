import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        
        // Access GameConfig to demonstrate static block execution
        // The static blocks in GameConfig will run automatically when you first access the class
        
        // Print whether config is loaded
        System.out.println("Config loaded: " + GameConfig.isConfigLoaded());
        
        // Print the max level
        System.out.println("Max level: " + GameConfig.getMaxLevel());
        
        // Print the threshold for the input level
        System.out.println("Level " + level + " threshold: " + GameConfig.getThreshold(level));
        
        // Print the threshold for level 1
        System.out.println("Level 1 threshold: " + GameConfig.getThreshold(1));
    }
}
