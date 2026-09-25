import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three books from input
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        
        // Parse each line to extract title, author, and year
        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");
        
        // Create Book objects from the parsed data
        Book book1 = new Book(parts1[0], parts1[1], Integer.parseInt(parts1[2]));
        Book book2 = new Book(parts2[0], parts2[1], Integer.parseInt(parts2[2]));
        Book book3 = new Book(parts3[0], parts3[1], Integer.parseInt(parts3[2]));
        
        // Create an ArrayList and add all three books
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        // Sort using natural ordering (by year) and print each book
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
        
        // Print an empty line
        System.out.println();
        
        // Sort by title using TitleComparator and print each book
        Collections.sort(books, new TitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        
        // Print an empty line
        System.out.println();
        
        // Sort by author using AuthorComparator and print each book
        Collections.sort(books, new AuthorComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}