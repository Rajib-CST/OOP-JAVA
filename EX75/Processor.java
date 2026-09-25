public class Processor {
    private String brand;
    private double speedGHz;
    
    public Processor(String brand, double speedGHz) {
        this.brand = brand;
        this.speedGHz = speedGHz;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getSpeedGHz() {
        return speedGHz;
    }
    
    public String process() {
        return brand + " processing at " + speedGHz + " GHz";
    }
}
