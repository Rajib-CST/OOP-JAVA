// Email notification class that extends Notification
class EmailNotification extends Notification {
    private String subject;
    
    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }
    
    @Override
    public void send() {
        System.out.println("Emailing " + getRecipient() + ": " + subject);
    }
}
