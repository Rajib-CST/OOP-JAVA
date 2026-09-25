class PayPal implements Payable {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    public String pay(double amount) {
        return String.format("Paid %.2f via PayPal account %s", amount, email);
    }
}
