final class EmailNotification extends Notification {
    private String recipient;
    
    public EmailNotification(String message, String recipient) {
        super(message);
        this.recipient = recipient;
    }
    
    @Override
    String deliver() {
        return "Sending email to " + recipient + ": " + message;
    }
}
