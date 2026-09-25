import java.util.Scanner;

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
        
        // Read user information
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();
        
        // Read operations string
        String operationsStr = scanner.nextLine();
        
        // Create Book objects
        Book book1 = new Book(isbn1, title1, author1);
        Book book2 = new Book(isbn2, title2, author2);
        
        // Create User object
        User user = new User(userId, userName);
        
        // Create Library and add books and user
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.registerUser(user);
        
        // Process operations
        String[] operations = operationsStr.split(",");
        for (String operation : operations) {
            String[] parts = operation.split(":");
            String action = parts[0];
            String opUserId = parts[1];
            String opIsbn = parts[2];
            
            if (action.equals("borrow")) {
                library.borrowBook(opUserId, opIsbn);
            } else if (action.equals("return")) {
                library.returnBook(opUserId, opIsbn);
            }
        }
        
        // Print summary
        System.out.println(isbn1 + ": " + (book1.isAvailable() ? "Available" : "Borrowed"));
        System.out.println(isbn2 + ": " + (book2.isAvailable() ? "Available" : "Borrowed"));
    }
}
