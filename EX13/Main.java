import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int pages = Integer.parseInt(scanner.nextLine());
        
        Book book = new Book(title, author, pages);
        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());
        System.out.println(book.getSummary());
    }
}