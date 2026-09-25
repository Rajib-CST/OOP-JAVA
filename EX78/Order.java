class Order {
    private String customerName;
    private CoffeeSize size;
    
    public Order(String customerName, CoffeeSize size) {
        this.customerName = customerName;
        this.size = size;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public CoffeeSize getSize() {
        return size;
    }
    
    public String getReceipt() {
        return "Order for: " + customerName + "\n" +
               "Size: " + size.getDescription() + "\n" +
               "Total: $" + size.getPrice();
    }
}
