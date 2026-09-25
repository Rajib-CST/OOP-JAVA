sealed abstract class Notification permits EmailNotification, SMSNotification, PushNotification {
    protected String message;
    
    public Notification(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    abstract String deliver();
}
