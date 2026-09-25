// Subclass that extends Notification for email-specific behavior
class EmailNotification extends Notification {
    private String recipient;
    
    public EmailNotification(String message, String recipient) {
        super(message);
        this.recipient = recipient;
    }
    
    @Override
    public void send() {
        System.out.println("Emailing " + recipient + ": " + getMessage());
    }
}
