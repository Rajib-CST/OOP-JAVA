import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternName = scanner.nextLine();
        
        Pattern pattern = null;
        
        if (patternName.equals("Singleton") || patternName.equals("Factory")) {
            pattern = new CreationalPattern();
        } else if (patternName.equals("Adapter") || patternName.equals("Decorator")) {
            pattern = new StructuralPattern();
        } else if (patternName.equals("Observer") || patternName.equals("Strategy")) {
            pattern = new BehavioralPattern();
        }
        
        System.out.println("Pattern: " + patternName);
        System.out.println("Category: " + pattern.getCategory());
        System.out.println("Purpose: " + pattern.getPurpose());
    }
}
