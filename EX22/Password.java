class Password {
    // Private field for storing the password
    private String password;
    
    // Private field for minimum length requirement
    private int minLength;
    
    // Constructor that takes minimum length requirement
    public Password(int minLength) {
        this.minLength = minLength;
        this.password = null;
    }
    
    // setPassword method that validates and sets the password
    // Return true if password meets minimum length, false otherwise
    public boolean setPassword(String password) {
        if (password.length() >= minLength) {
            this.password = password;
            return true;
        }
        return false;
    }
    
    // getMaskedPassword method that returns asterisks instead of actual password
    // Never expose the actual password!
    public String getMaskedPassword() {
        if (password == null) {
            return "";
        }
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            masked.append("*");
        }
        return masked.toString();
    }
    
    // checkPassword method that compares attempt with stored password
    public boolean checkPassword(String attempt) {
        if (password == null) {
            return false;
        }
        return password.equals(attempt);
    }
    
    // getLength method that returns password length (or 0 if not set)
    public int getLength() {
        if (password == null) {
            return 0;
        }
        return password.length();
    }
}
