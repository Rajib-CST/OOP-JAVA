class NotificationCenter {
    public String dispatch(MessageSender sender, String recipient, String message) {
        return sender.send(recipient, message);
    }
}
