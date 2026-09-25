import java.util.Scanner;

class Notification {
    private String message;
    public Notification(String message) { this.message = message; }
    public String getMessage() { return this.message; }
    public void send() { System.out.println("Sending notification: " + this.message); }
}

class SmsNotification extends Notification {
    private String phone;
    public SmsNotification(String message, String phone) { super(message); this.phone = phone; }
    @Override
    public void send() { System.out.println("Texting " + this.phone + ": " + getMessage()); }
}

class PushNotification extends Notification {
    private String deviceId;
    public PushNotification(String message, String deviceId) { super(message); this.deviceId = deviceId; }
    @Override
    public void send() { System.out.println("Pushing to " + this.deviceId + ": " + getMessage()); }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String phone = sc.nextLine();
        String deviceId = sc.nextLine();
        Notification[] notifications = { new Notification(message),
            new SmsNotification(message, phone), new PushNotification(message, deviceId) };
        for (Notification n : notifications) { n.send(); }
    }
}
