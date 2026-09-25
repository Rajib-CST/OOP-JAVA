
enum CoffeeSize {
    SMALL(2.50), MEDIUM(3.50), LARGE(4.50);
    
    private double price;
    
    CoffeeSize(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDescription() {
        return name() + " - $" + price;
    }
}
