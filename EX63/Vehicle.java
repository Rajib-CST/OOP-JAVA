// Abstract class - use when classes share state AND behavior
abstract class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }
    
    public abstract String startEngine();
    
    public String getInfo() {
        return brand + " (" + year + ")";
    }
}
