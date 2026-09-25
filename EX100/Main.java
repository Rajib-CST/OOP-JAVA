import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String message = scanner.nextLine();
        String channelsInput = scanner.nextLine();
        
        Notifier notifier = new BasicNotifier();
        
        String[] channels = channelsInput.split(",");
        
        for (String channel : channels) {
            if (channel.equals("email")) {
                notifier = new EmailDecorator(notifier);
            } else if (channel.equals("sms")) {
                notifier = new SMSDecorator(notifier);
            } else if (channel.equals("push")) {
                notifier = new PushDecorator(notifier);
            }
        }
        
        notifier.send(message);
    }
}
