import java.util.ArrayList;

class RentalAgency {
    private ArrayList<Vehicle> vehicles;
    
    public RentalAgency() {
        vehicles = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    
    public Vehicle findVehicle(String licensePlate) {
        for (Vehicle v : vehicles) {
            if (v.getLicensePlate().equals(licensePlate)) {
                return v;
            }
        }
        return null;
    }
    
    public double rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException {
        Vehicle vehicle = findVehicle(licensePlate);
        if (vehicle == null) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        Rentable rentable = (Rentable) vehicle;
        if (!rentable.rent()) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        return rentable.calculateCost(days);
    }
    
    public boolean returnVehicle(String licensePlate) {
        Vehicle vehicle = findVehicle(licensePlate);
        if (vehicle == null) {
            return false;
        }
        Rentable rentable = (Rentable) vehicle;
        return rentable.returnVehicle();
    }
    
    public ArrayList<Vehicle> getAvailableVehicles() {
        ArrayList<Vehicle> available = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getStatus() == RentalStatus.AVAILABLE) {
                available.add(v);
            }
        }
        return available;
    }
    
    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }
}
