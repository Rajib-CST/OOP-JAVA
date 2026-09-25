import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String username = scanner.nextLine();
        int age = scanner.nextInt();
        
        try (UserValidator validator = new UserValidator()) {
            validator.validateUsername(username);
            validator.validateAge(age);
            System.out.println("User registration successful!");
        } catch (InvalidUsernameException e) {
            System.out.println("Username error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Age error: " + e.getMessage());
        } catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
