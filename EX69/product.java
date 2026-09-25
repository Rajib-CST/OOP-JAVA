class Product {
    // TODO: Declare three private fields:
    // - name (String)
    // - price (double)
    // - quantity (int)
    private String name;
    private double price;
    private int quantity;

    // TODO: Create a constructor that initializes all three fields
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // TODO: Override the toString() method
    // Return format: Product[name=X, price=Y, quantity=Z]
    // where X, Y, Z are the actual field values
    @Override
    public String toString() {
        return "Product[name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
