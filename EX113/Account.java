public abstract class Account {
    private String accountNumber;
    private double balance;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract String getAccountType();
    
    public String getDetails() {
        return String.format("%s (%s): $%.2f", accountNumber, getAccountType(), balance);
    }
}
