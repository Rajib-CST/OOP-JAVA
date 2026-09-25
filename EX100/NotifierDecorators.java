abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;
    
    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }
}

class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        wrappedNotifier.send(message);
        System.out.println("Email: " + message);
    }
}

class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        wrappedNotifier.send(message);
        System.out.println("SMS: " + message);
    }
}

class PushDecorator extends NotifierDecorator {
    public PushDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        wrappedNotifier.send(message);
        System.out.println("Push: " + message);
    }
}
