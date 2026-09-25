import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();
        
        // Create a Notification object with the message
        Notification notification = new Notification(message);
        
        // Create an EmailNotification object with the message and recipient
        EmailNotification emailNotification = new EmailNotification(message, recipient);
        
        // Call send() on the Notification object
        notification.send();
        
        // Call send() on the EmailNotification object
        emailNotification.send();
    }
}
