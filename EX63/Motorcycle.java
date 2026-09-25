// Motorcycle extends Vehicle but does NOT implement Convertible
// (motorcycles don't have roofs to convert!)
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    
    public String startEngine() {
        return brand + " motorcycle engine roaring";
    }
}
