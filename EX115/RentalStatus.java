enum RentalStatus {
    AVAILABLE("ready to rent"),
    RENTED("currently in use"),
    MAINTENANCE("under service");
    
    private String description;
    
    RentalStatus(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
