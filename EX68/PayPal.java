class EmailSender implements MessageSender {
    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    @Override
    public String send(String recipient, String message) {
        return String.format("Email sent from %s to %s: %s", email, recipient, message);
    }
}
