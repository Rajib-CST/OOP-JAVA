public class BankAccount {
    // Created a private String field 'accountName'
    private String accountName;
    
    // Created a private double field 'balance'
    private double balance;
    
    // Created a constructor that takes accountName and initialBalance
    // Assigned them using 'this'
    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }
    
    // Created a getter getAccountName() that returns accountName
    public String getAccountName() {
        return this.accountName;
    }
    
    // Created a getter getBalance() that returns balance
    public double getBalance() {
        return this.balance;
    }
    
    // Created a deposit(double amount) method
    // Adds amount to balance if amount > 0
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    
    // Created a withdraw(double amount) method that returns a String
    // If amount > 0 and amount <= balance, subtracts and returns "Success"
    // Otherwise returns "Insufficient funds"
    public String withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return "Success";
        } else {
            return "Insufficient funds";
        }
    }
}