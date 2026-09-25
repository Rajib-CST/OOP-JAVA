// Base class for all notifications
class Notification {
    private String recipient;
    
    public Notification(String recipient) {
        this.recipient = recipient;
    }
    
    public String getRecipient() {
        return recipient;
    }
    
    public void send() {
        System.out.println("Sending notification to " + recipient);
    }
}
