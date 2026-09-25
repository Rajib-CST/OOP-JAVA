class Motorcycle extends Vehicle implements Rentable {
    private int engineCC;
    
    public Motorcycle(String licensePlate, String brand, double dailyRate, int engineCC) {
        super(licensePlate, brand, dailyRate);
        this.engineCC = engineCC;
    }
    
    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
    
    @Override
    public boolean rent() {
        if (getStatus() == RentalStatus.AVAILABLE) {
            setStatus(RentalStatus.RENTED);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean returnVehicle() {
        if (getStatus() == RentalStatus.RENTED) {
            setStatus(RentalStatus.AVAILABLE);
            return true;
        }
        return false;
    }
    
    @Override
    public double calculateCost(int days) {
        return getDailyRate() * days * 0.9;
    }
}
