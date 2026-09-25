class VehicleNotAvailableException extends Exception {
    public VehicleNotAvailableException(String licensePlate) {
        super("Vehicle not available: " + licensePlate);
    }
}
