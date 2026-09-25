// InvalidAgeException.java
// Unchecked exception for age-related programming errors

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
