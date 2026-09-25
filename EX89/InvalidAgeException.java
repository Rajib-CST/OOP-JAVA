// InvalidAgeException.java
// This is a CHECKED exception - extends Exception directly
// Callers will be FORCED to handle this exception

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
