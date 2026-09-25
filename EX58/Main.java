interface Notification {
    void send(String message);

    default void log(String message) {
        System.out.println("Logged: " + message);
    }
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class NotificationService {
    static void notifyUser(Notification notification, String message) {
        notification.send(message); // Runtime polymorphism
        notification.log(message);  // Interface default method
    }
}

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification(), new SmsNotification()
        };

        for (Notification notification : notifications) {
            NotificationService.notifyUser(notification, "Welcome!");
        }
    }
}
