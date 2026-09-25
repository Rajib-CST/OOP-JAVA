// Child class that extends Appliance
class WashingMachine extends Appliance {
    private int capacity;
    
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public String getInfo() {
        return super.getInfo() + ", Capacity: " + capacity + "kg";
    }
}
