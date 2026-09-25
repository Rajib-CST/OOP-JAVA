public class CheckingAccount extends Account implements Transactable {
    private double overdraftLimit;
    
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public String getAccountType() {
        return "Checking";
    }
    
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }
}
