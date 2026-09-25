class Car extends Vehicle implements Rentable {
    private int seats;
    
    public Car(String licensePlate, String brand, double dailyRate, int seats) {
        super(licensePlate, brand, dailyRate);
        this.seats = seats;
    }
    
    @Override
    public String getVehicleType() {
        return "Car";
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
        return getDailyRate() * days;
    }
}
