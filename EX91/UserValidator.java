// UserValidator.java
// A validation session that implements AutoCloseable

class UserValidator implements AutoCloseable {
    
    public UserValidator() {
        System.out.println("Validator session started");
    }
    
    public void validateUsername(String username) throws InvalidUsernameException {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new InvalidUsernameException("Username must be at least 3 characters");
        }
        System.out.println("Username '" + username + "' is valid");
    }
    
    public void validateAge(int age) throws ValidationException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        if (age < 13) {
            throw new ValidationException("Must be at least 13 years old");
        }
        System.out.println("Age " + age + " is valid");
    }
    
    @Override
    public void close() {
        System.out.println("Validator session closed");
    }
}
