abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private double dailyRate;
    private RentalStatus status;
    
    public Vehicle(String licensePlate, String brand, double dailyRate) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.dailyRate = dailyRate;
        this.status = RentalStatus.AVAILABLE;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getDailyRate() {
        return dailyRate;
    }
    
    public RentalStatus getStatus() {
        return status;
    }
    
    public void setStatus(RentalStatus status) {
        this.status = status;
    }
    
    public abstract String getVehicleType();
    
    public String getDetails() {
        return String.format("%s %s (%s) - $%.2f/day - %s", 
            licensePlate, brand, getVehicleType(), dailyRate, status.getDescription());
    }
}
