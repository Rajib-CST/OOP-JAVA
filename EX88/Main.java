import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = scanner.nextInt();
        int seatNumber = scanner.nextInt();
        
        TicketBooth booth = new TicketBooth(totalSeats);
        
        try {
            booth.bookTicket(seatNumber);
        } catch (TicketSoldOutException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } catch (InvalidSeatException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
        
        System.out.println("Remaining seats: " + booth.getAvailableSeats());
    }
}
