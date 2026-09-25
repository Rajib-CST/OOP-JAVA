import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        System.out.println("=== Checked Exception Method ===");
        try {
            AgeVerifier.verifyAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        } catch (NegativeAgeException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("=== Unchecked Exception Method ===");
        try {
            AgeVerifier.verifyAgeUncheckedOnly(age);
        } catch (NegativeAgeException e) {
            System.out.println("Runtime exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument caught: " + e.getMessage());
        }
    }
}
