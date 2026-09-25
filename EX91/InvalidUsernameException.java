// InvalidUsernameException.java
// Checked exception for username validation failures

class InvalidUsernameException extends ValidationException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
