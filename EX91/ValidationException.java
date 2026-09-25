// ValidationException.java
// Base checked exception for all validation errors

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
