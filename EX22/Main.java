import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the password to set
        String passwordToSet = scanner.nextLine();
        // Read the password attempt to check
        String passwordAttempt = scanner.nextLine();
        
        // Create a Password object with minimum length of 6
        Password password = new Password(6);
        
        // Set the password and print the result ("Set: true" or "Set: false")
        boolean setResult = password.setPassword(passwordToSet);
        System.out.println("Set: " + setResult);
        
        // Print the masked password ("Masked: ******")
        System.out.println("Masked: " + password.getMaskedPassword());
        
        // Check the password attempt and print the result ("Match: true" or "Match: false")
        boolean matchResult = password.checkPassword(passwordAttempt);
        System.out.println("Match: " + matchResult);
        
    }
}
