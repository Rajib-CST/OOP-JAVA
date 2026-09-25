import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    
    public Bank() {
        accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    public String transfer(String fromAccount, String toAccount, double amount) throws InsufficientFundsException {
        Account source = findAccount(fromAccount);
        Account destination = findAccount(toAccount);
        
        if (source instanceof Transactable && destination instanceof Transactable) {
            Transactable sourceTransactable = (Transactable) source;
            Transactable destTransactable = (Transactable) destination;
            
            if (!sourceTransactable.withdraw(amount)) {
                throw new InsufficientFundsException(amount, source.getBalance());
            }
            destTransactable.deposit(amount);
            return String.format("Transferred $%.2f from %s to %s", amount, fromAccount, toAccount);
        }
        return null;
    }
    
    public double getTotalDeposits() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
