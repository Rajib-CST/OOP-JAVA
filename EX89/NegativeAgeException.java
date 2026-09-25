// NegativeAgeException.java
// This is an UNCHECKED exception - extends RuntimeException
// Callers are NOT forced to handle this exception

class NegativeAgeException extends RuntimeException {
    public NegativeAgeException(String message) {
        super(message);
    }
}
