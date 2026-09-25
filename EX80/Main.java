import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the four inputs
        String message = scanner.nextLine();
        String email = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String deviceId = scanner.nextLine();
        
        // Create one of each notification type using the same message
        EmailNotification emailNotification = new EmailNotification(message, email);
        SMSNotification smsNotification = new SMSNotification(message, phoneNumber);
        PushNotification pushNotification = new PushNotification(message, deviceId);
        
        // Store all three notifications in a Notification[] array
        Notification[] notifications = {emailNotification, smsNotification, pushNotification};
        
        // Iterate through the array and print the result of deliver()
        for (Notification notification : notifications) {
            System.out.println(notification.deliver());
        }
    }
}
