// Base class at the top of the hierarchy
public class Vehicle {
    private String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void move() {
        System.out.println(brand + " is moving");
    }
}
