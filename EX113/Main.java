import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Bank bank = new Bank();
        
        String[] commands = input.split(",");
        
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];
            
            switch (action) {
                case "SAVINGS": {
                    String accountNumber = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    double interestRate = Double.parseDouble(parts[3]);
                    SavingsAccount savings = new SavingsAccount(accountNumber, balance, interestRate);
                    bank.addAccount(savings);
                    System.out.println("Account created: " + accountNumber);
                    break;
                }
                case "CHECKING": {
                    String accountNumber = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    double overdraftLimit = Double.parseDouble(parts[3]);
                    CheckingAccount checking = new CheckingAccount(accountNumber, balance, overdraftLimit);
                    bank.addAccount(checking);
                    System.out.println("Account created: " + accountNumber);
                    break;
                }
                case "DEPOSIT": {
                    String accountNumber = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof Transactable) {
                        ((Transactable) account).deposit(amount);
                        System.out.printf("Deposited $%.2f to %s%n", amount, accountNumber);
                    }
                    break;
                }
                case "WITHDRAW": {
                    String accountNumber = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof Transactable) {
                        boolean success = ((Transactable) account).withdraw(amount);
                        if (success) {
                            System.out.printf("Withdrew $%.2f from %s%n", amount, accountNumber);
                        } else {
                            System.out.println("Withdrawal failed: " + accountNumber);
                        }
                    }
                    break;
                }
                case "TRANSFER": {
                    String fromAccount = parts[1];
                    String toAccount = parts[2];
                    double amount = Double.parseDouble(parts[3]);
                    try {
                        String result = bank.transfer(fromAccount, toAccount, amount);
                        System.out.println(result);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Transfer failed: " + e.getMessage());
                    }
                    break;
                }
                case "INTEREST": {
                    String accountNumber = parts[1];
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                        System.out.println("Interest applied to " + accountNumber);
                    }
                    break;
                }
            }
        }
        
        System.out.println("--- Bank Summary ---");
        for (Account account : bank.getAccounts()) {
            System.out.println(account.getDetails());
        }
        System.out.printf("Total deposits: $%.2f%n", bank.getTotalDeposits());
    }
}
