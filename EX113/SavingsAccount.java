public class SavingsAccount extends Account implements Transactable {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public String getAccountType() {
        return "Savings";
    }
    
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }
    
    public void applyInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }
}
