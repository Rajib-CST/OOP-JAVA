// Parent class representing any household appliance
class Appliance {
    private String brand;
    private int wattage;
    
    public Appliance(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getWattage() {
        return wattage;
    }
    
    public String getInfo() {
        return brand + " - " + wattage + "W";
    }
}
