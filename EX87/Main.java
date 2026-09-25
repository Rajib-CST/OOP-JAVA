import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        
        System.out.println("=== Specific Catch ===");
        ExceptionAnalyzer.analyzeSpecific(type);
        
        System.out.println();
        System.out.println("=== Parent Catch ===");
        ExceptionAnalyzer.analyzeWithParent();
        
        System.out.println();
        System.out.println("=== Grandparent Catch ===");
        ExceptionAnalyzer.analyzeWithGrandparent();
    }
}
