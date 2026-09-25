import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String accountNumber = scanner.nextLine();
        String ownerName = scanner.nextLine();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();
        
        // Create a BankAccount object with accountNumber and ownerName
        BankAccount account = new BankAccount(accountNumber, ownerName);
        
        // Perform deposit and print result as "Deposit: true" or "Deposit: false"
        boolean depositResult = account.deposit(depositAmount);
        System.out.println("Deposit: " + depositResult);
        
        // Perform first withdrawal and print result as "Withdraw 1: true" or "Withdraw 1: false"
        boolean withdraw1Result = account.withdraw(withdrawAmount1);
        System.out.println("Withdraw 1: " + withdraw1Result);
        
        // Perform second withdrawal and print result as "Withdraw 2: true" or "Withdraw 2: false"
        boolean withdraw2Result = account.withdraw(withdrawAmount2);
        System.out.println("Withdraw 2: " + withdraw2Result);
        
        // Print the account summary
        System.out.println(account.getAccountSummary());
    }
}
