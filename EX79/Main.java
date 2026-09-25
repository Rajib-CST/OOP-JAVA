import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String title = scanner.nextLine();
        String genre = scanner.nextLine();
        int durationMinutes = Integer.parseInt(scanner.nextLine());
        String seatNumber = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        
        // Create a Movie record with title, genre, and durationMinutes
        Movie movie = new Movie(title, genre, durationMinutes);
        
        // Create a Ticket record with the movie, seatNumber, and price
        Ticket ticket = new Ticket(movie, seatNumber, price);
        
        // Print the ticket using printTicket() method
        System.out.println(ticket.printTicket());
        
    }
}
