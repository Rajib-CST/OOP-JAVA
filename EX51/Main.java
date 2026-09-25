import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String recipient = scanner.nextLine();
        String subject = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        
        // Create an array of Notification references with 3 elements
        Notification[] notifications = new Notification[3];
        notifications[0] = new Notification(recipient);
        notifications[1] = new EmailNotification(recipient, subject);
        notifications[2] = new SMSNotification(recipient, phoneNumber);
        
        // Loop through the array and call send() on each element
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
