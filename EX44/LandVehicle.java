// Middle level class that extends Vehicle
public class LandVehicle extends Vehicle {
    private int wheels;
    
    public LandVehicle(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }
    
    public int getWheels() {
        return wheels;
    }
    
    public void honk() {
        System.out.println(getBrand() + " honks!");
    }
}
