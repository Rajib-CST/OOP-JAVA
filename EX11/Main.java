import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double initial = Double.parseDouble(scanner.nextLine());
        double deposit = Double.parseDouble(scanner.nextLine());
        
        BankAccount account = new BankAccount(name, initial);
        
        System.out.println("Account: " + account.getAccountName());
        System.out.println("Balance: " + account.getBalance());
        
        account.deposit(deposit);
        System.out.println("After deposit: " + account.getBalance());
        
        String result = account.withdraw(2000);
        System.out.println("Withdraw 2000: " + result);
        System.out.println("Final Balance: " + account.getBalance());
    }
}