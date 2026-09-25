// AgeVerifier.java
// Contains methods that demonstrate checked vs unchecked exceptions

class AgeVerifier {
    
    public static void verifyAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        }
        if (age < 18) {
            throw new InvalidAgeException("Must be 18 or older: " + age);
        }
        System.out.println("Age " + age + " verified successfully");
    }
    
    public static void verifyAgeUncheckedOnly(int age) {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        }
        if (age < 18) {
            throw new IllegalArgumentException("Too young: " + age);
        }
        System.out.println("Age " + age + " verified (unchecked method)");
    }
}
