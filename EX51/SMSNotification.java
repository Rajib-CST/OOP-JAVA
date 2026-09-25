// SMS notification class that extends Notification
class SMSNotification extends Notification {
    private String phoneNumber;
    
    public SMSNotification(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void send() {
        System.out.println("Texting " + phoneNumber + " for " + getRecipient());
    }
}
