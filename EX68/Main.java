import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String recipient = scanner.nextLine();
        String message = scanner.nextLine();

        NotificationCenter center = new NotificationCenter();
        EmailSender emailSender = new EmailSender(email);
        SmsSender smsSender = new SmsSender(phoneNumber);

        System.out.println(center.dispatch(emailSender, recipient, message));
        System.out.println(center.dispatch(smsSender, recipient, message));
    }
}
