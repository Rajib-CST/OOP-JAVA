class EmailMessenger implements Messenger {
    private String recipient;
    
    public EmailMessenger(String recipient) {
        this.recipient = recipient;
    }
    
    public void sendMessage(String message) {
        System.out.println("Email to " + recipient + ": " + message);
    }
}

