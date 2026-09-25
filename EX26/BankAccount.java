class BankAccount {
    // Declare an immutable (final) account number
    private final String accountNumber;
    
    // Declare a private balance initialized to 0.0
    private double balance = 0.0;
    
    // Declare a private owner name
    private String ownerName;
    
    // Create a constructor that takes accountNumber and ownerName
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    // Create a getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Create a getter for owner name
    public String getOwnerName() {
        return ownerName;
    }
    
    // Create a getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Create deposit method that returns true if amount is positive, false otherwise
    // Only add to balance if amount is positive
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    // Create withdraw method that returns true if amount is positive AND sufficient funds exist
    // Only subtract from balance if conditions are met
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    // Create getAccountSummary method
    // Return format: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]"
    // Use String.format("%.2f", balance) for formatting balance to 2 decimal places
    public String getAccountSummary() {
        return "Account " + accountNumber + " | Owner: " + ownerName + " | Balance: $" + String.format("%.2f", balance);
    }
}
