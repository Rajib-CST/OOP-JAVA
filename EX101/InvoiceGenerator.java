// Concrete subclass for generating invoices
class InvoiceGenerator extends DocumentGenerator {
    
    // Private fields to store customer name and amount
    private String customerName;
    private double amount;
    
    // Constructor that takes customer name (String) and amount (double)
    public InvoiceGenerator(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
    
    // Implement createHeader() to print: *** INVOICE ***
    void createHeader() {
        System.out.println("*** INVOICE ***");
    }
    
    // Implement createBody() to print:
    // Customer: [name]
    // Amount Due: $[amount] (format amount to two decimal places)
    void createBody() {
        System.out.println("Customer: " + customerName);
        System.out.println("Amount Due: $" + String.format("%.2f", amount));
    }
    
    // Override createFooter() to print: Thank you for your business!
    @Override
    void createFooter() {
        System.out.println("Thank you for your business!");
    }
    
}
