// Bottom level class that extends LandVehicle
public class Car extends LandVehicle {
    private String model;
    
    public Car(String brand, int wheels, String model) {
        super(brand, wheels);
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
    
    public void displayInfo() {
        System.out.println(getBrand() + " " + model + " with " + getWheels() + " wheels");
    }
}
