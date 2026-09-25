class SmsSender implements MessageSender {
    private String phoneNumber;

    public SmsSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send(String recipient, String message) {
        return String.format("SMS sent from %s to %s: %s", phoneNumber, recipient, message);
    }
}
