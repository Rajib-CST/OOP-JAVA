class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product constructor: " + name);
    }
    
    public Product(String name) {
        this(name, 0.0);
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
