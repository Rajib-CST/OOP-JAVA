class Electronics extends Product {
    private int warrantyYears;
    
    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
        System.out.println("Electronics constructor: " + warrantyYears + " year warranty");
    }
    
    public Electronics(String name, double price) {
        this(name, price, 1);
    }
    
    public Electronics(String name) {
        this(name, 0.0);
    }
    
    public String getDetails() {
        return getName() + " - $" + String.format("%.2f", getPrice()) + " (" + warrantyYears + " year warranty)";
    }
}
