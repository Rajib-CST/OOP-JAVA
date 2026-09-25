public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double amount, double balance) {
        super(String.format("Insufficient funds: attempted %.2f, available %.2f", amount, balance));
    }
}
