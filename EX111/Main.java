import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the comma-separated commands
        String input = scanner.nextLine();
        String[] commands = input.split(",");
        
        // Create Library and AdminService
        Library library = new Library();
        AdminService adminService = new AdminService(library);
        
        // Process each command
        for (String command : commands) {
            String[] parts = command.split(":");
            String operation = parts[0];
            
            if (operation.equals("ADD_BOOK")) {
                String isbn = parts[1];
                String title = parts[2];
                String author = parts[3];
                if (adminService.addBook(isbn, title, author)) {
                    System.out.println("Added: " + title);
                }
            } else if (operation.equals("REMOVE_BOOK")) {
                String isbn = parts[1];
                if (adminService.removeBook(isbn)) {
                    System.out.println("Removed: " + isbn);
                } else {
                    System.out.println("Cannot remove: " + isbn);
                }
            } else if (operation.equals("REGISTER_USER")) {
                String id = parts[1];
                String name = parts[2];
                if (adminService.registerUser(id, name)) {
                    System.out.println("Registered: " + name);
                }
            } else if (operation.equals("BORROW")) {
                String userId = parts[1];
                String isbn = parts[2];
                try {
                    String result = library.borrowBook(userId, isbn);
                    System.out.println(result);
                } catch (LibraryException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (operation.equals("RETURN")) {
                String userId = parts[1];
                String isbn = parts[2];
                library.returnBook(userId, isbn);
            } else if (operation.equals("SEARCH_TITLE")) {
                String keyword = parts[1];
                ArrayList<Book> results = library.searchByTitle(keyword);
                System.out.println("Search '" + keyword + "':");
                if (results.isEmpty()) {
                    System.out.println("No results");
                } else {
                    for (Book book : results) {
                        System.out.println(book.getDetails());
                    }
                }
            } else if (operation.equals("SEARCH_AUTHOR")) {
                String keyword = parts[1];
                ArrayList<Book> results = library.searchByAuthor(keyword);
                System.out.println("Search '" + keyword + "':");
                if (results.isEmpty()) {
                    System.out.println("No results");
                } else {
                    for (Book book : results) {
                        System.out.println(book.getDetails());
                    }
                }
            }
        }
        
        // Print final status
        System.out.println("--- Final Status ---");
        System.out.println("Books: " + library.getAllBooks().size());
        System.out.println("Users: " + library.getAllUsers().size());
        for (User user : library.getAllUsers()) {
            System.out.println(user.getName() + ": " + user.getBorrowedCount() + " book(s)");
        }
    }
}
