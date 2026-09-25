class MessageFormatter {
    
    // Format method that takes only a message
    // Returns the message wrapped in brackets: [message]
    public String format(String message) {
        return "[" + message + "]";
    }
    
    // Format method that takes a message and repeatCount
    // Returns the message repeated repeatCount times, separated by spaces
    public String format(String message, int repeatCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(message);
        }
        return result.toString();
    }
    
    // Format method that takes a message and prefix
    // Returns: prefix: message
    public String format(String message, String prefix) {
        return prefix + ": " + message;
    }
    
    // Format method that takes a message, prefix, and suffix
    // Returns: prefix: message (suffix)
    public String format(String message, String prefix, String suffix) {
        return prefix + ": " + message + " (" + suffix + ")";
    }
    
}
