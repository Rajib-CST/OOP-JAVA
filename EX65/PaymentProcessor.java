class PaymentProcessor {
    public String processPayment(Payable paymentMethod, double amount) {
        return paymentMethod.pay(amount);
    }
}
