record Ticket(Movie movie, String seatNumber, double price) {
    
    public Ticket {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
    }
    
    public String printTicket() {
        return "========== TICKET ==========\n" +
               "Movie: " + movie.title() + "\n" +
               "Genre: " + movie.genre() + "\n" +
               "Duration: " + movie.getFormattedDuration() + "\n" +
               "Seat: " + seatNumber + "\n" +
               "Price: $" + price + "\n" +
               "============================";
    }
    
}
