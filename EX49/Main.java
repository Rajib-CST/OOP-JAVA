import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String message = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();
        
        // Create a MessageFormatter object
        MessageFormatter formatter = new MessageFormatter();
        
        // Call format with just the message and print the result
        System.out.println(formatter.format(message));
        
        // Call format with message and repeatCount and print the result
        System.out.println(formatter.format(message, repeatCount));
        
        // Call format with message and prefix and print the result
        System.out.println(formatter.format(message, prefix));
        
        // Call format with message, prefix, and suffix and print the result
        System.out.println(formatter.format(message, prefix, suffix));
        
    }
}
