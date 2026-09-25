class TicketBooth {
    private int availableSeats;
    private int totalSeats;
    
    public TicketBooth(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
    
    public void bookTicket(int seatNumber) throws TicketSoldOutException {
        if (availableSeats <= 0) {
            throw new TicketSoldOutException("No tickets remaining");
        }
        if (seatNumber < 1 || seatNumber > totalSeats) {
            throw new InvalidSeatException("Seat " + seatNumber + " does not exist");
        }
        availableSeats--;
        System.out.println("Booked seat " + seatNumber + " successfully");
    }
    
    public int getAvailableSeats() {
        return availableSeats;
    }
}
