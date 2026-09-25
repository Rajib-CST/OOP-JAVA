import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read book information
        String isbn = scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        
        // Read user information
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();
        
        // Create a Book object with isbn, title, and author
        Book book = new Book(isbn, title, author);
        
        // Create a User object with userId and userName
        User user = new User(userId, userName);
        
        // Print the book's details using getDetails()
        System.out.println(book.getDetails());
        
        // Print whether the book is available (format: "Available: true" or "Available: false")
        System.out.println("Available: " + book.isAvailable());
        
        // Print the user using toString()
        System.out.println(user.toString());
    }
}
