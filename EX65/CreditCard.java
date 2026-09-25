class CreditCard implements Payable {
    private String cardNumber;
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public String pay(double amount) {
        return String.format("Paid %.2f using Credit Card ending in %s", amount, cardNumber);
    }
}
