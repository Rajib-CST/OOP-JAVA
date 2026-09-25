import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String emailRecipient = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String message = scanner.nextLine();
        
        String formattedMessage = Messenger.formatMessage(message);
        
        EmailMessenger emailMessenger = new EmailMessenger(emailRecipient);
        
        SMSMessenger smsMessenger = new SMSMessenger(phoneNumber);
        
        emailMessenger.sendWithTimestamp(formattedMessage);
        
        smsMessenger.sendWithTimestamp(formattedMessage);
    }
}
