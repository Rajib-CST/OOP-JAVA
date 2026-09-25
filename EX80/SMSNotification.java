non-sealed class SMSNotification extends Notification {
    private String phoneNumber;
    
    public SMSNotification(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    String deliver() {
        return "Sending SMS to " + phoneNumber + ": " + message;
    }
}
