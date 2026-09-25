import java.util.Scanner;
class Payment {
    protected double amount;
    public Payment(double amount) { this.amount = amount; }
    public double getAmount() { return this.amount; }
    public String process() { return "Processing payment of " + this.amount; }
}
class CardPayment extends Payment {
    private String cardNumber;
    public CardPayment(double amount, String cardNumber) { super(amount); this.cardNumber = cardNumber; }
    @Override
    public String process() { return "Charging card " + this.cardNumber + " for " + this.amount; }
}
class CashPayment extends Payment {
    public CashPayment(double amount) { super(amount); }
    @Override
    public String process() { return "Collecting cash payment of " + this.amount; }
}
class WalletPayment extends Payment {
    private String walletId;
    public WalletPayment(double amount, String walletId) { super(amount); this.walletId = walletId; }
    @Override
    public String process() { return "Deducting " + this.amount + " from wallet " + this.walletId; }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment[] payments = {
            new CardPayment(Double.parseDouble(sc.nextLine()), sc.nextLine()),
            new CashPayment(Double.parseDouble(sc.nextLine())),
            new WalletPayment(Double.parseDouble(sc.nextLine()), sc.nextLine())
        };
        double total = 0;
        for (Payment p : payments) {
            System.out.println(p.process());
            total = total + p.getAmount();
        }
        System.out.println("Total: " + total);
    }
}
