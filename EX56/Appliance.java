abstract class Appliance {
    protected String brand;
    protected int wattage;
    
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
    
    public abstract void operate();
}
