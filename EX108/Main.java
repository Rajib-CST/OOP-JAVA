import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read book 1 information
        String isbn1 = scanner.nextLine();
        String title1 = scanner.nextLine();
        String author1 = scanner.nextLine();
        
        // Read book 2 information
        String isbn2 = scanner.nextLine();
        String title2 = scanner.nextLine();
        String author2 = scanner.nextLine();
        
        // Read book 3 information
        String isbn3 = scanner.nextLine();
        String title3 = scanner.nextLine();
        String author3 = scanner.nextLine();
        
        // Read user information
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();
        
        // Read borrow operation
        String borrowOp = scanner.nextLine();
        
        // Read search keywords
        String titleKeyword = scanner.nextLine();
        String authorKeyword = scanner.nextLine();
        
        // Create Book objects
        Book book1 = new Book(isbn1, title1, author1);
        Book book2 = new Book(isbn2, title2, author2);
        Book book3 = new Book(isbn3, title3, author3);
        
        // Create User object
        User user = new User(userId, userName);
        
        // Create Library and add books and user
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.registerUser(user);
        
        // Process borrow operation
        String[] parts = borrowOp.split(":");
        String opUserId = parts[0];
        String opIsbn = parts[1];
        library.borrowBook(opUserId, opIsbn);
        
        // Title search
        System.out.println("Title search '" + titleKeyword + "':");
        ArrayList<Book> titleResults = library.searchByTitle(titleKeyword);
        if (titleResults.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : titleResults) {
                System.out.println(book.getDetails());
            }
        }
        
        // Author search
        System.out.println("Author search '" + authorKeyword + "':");
        ArrayList<Book> authorResults = library.searchByAuthor(authorKeyword);
        if (authorResults.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : authorResults) {
                System.out.println(book.getDetails());
            }
        }
        
        // Available books
        System.out.println("Available books:");
        ArrayList<Book> availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getDetails());
        }
    }
}
