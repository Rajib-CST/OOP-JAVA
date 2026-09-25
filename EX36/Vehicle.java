public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        System.out.println(brand + " is starting");
    }
}