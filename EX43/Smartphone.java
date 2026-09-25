class Smartphone extends Gadget {
    private String brand;
    
    public Smartphone(String name, int year, String brand) {
        super(name, year);
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String toString() {
        return "Smartphone: " + brand + " " + getName() + " (" + getYear() + ")";
    }
}
