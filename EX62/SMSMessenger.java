class SMSMessenger implements Messenger {
    private String phoneNumber;
    
    public SMSMessenger(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void sendMessage(String message) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }
    
    public void sendWithTimestamp(String message) {
        System.out.print("[URGENT] ");
        sendMessage(message);
    }
}
