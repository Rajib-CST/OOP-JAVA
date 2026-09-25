interface Messenger {
    void sendMessage(String message);
    
    default void sendWithTimestamp(String message) {
        System.out.print("[TIMESTAMP] ");
        sendMessage(message);
    }
    
    static String formatMessage(String message) {
        return message.toUpperCase();
    }
}
