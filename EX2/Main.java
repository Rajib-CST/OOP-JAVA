 import java.util.Scanner;

class Book {
    private String title;
    private int pages;
    public Book(String title, int pages) { this.title = title; this.pages = pages; }
    public String getTitle() { return this.title; }
    public int getPages() { return this.pages; }
}

class Shelf {
    private Book first;
    private Book second;
    public Shelf(Book first, Book second) { this.first = first; this.second = second; }
    public int totalPages() { return this.first.getPages() + this.second.getPages(); }
    public String longestTitle() { return this.first.getTitle().length() >= this.second.getTitle().length() ? this.first.getTitle() : this.second.getTitle(); }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title1 = sc.nextLine();
        int pages1 = Integer.parseInt(sc.nextLine());
        String title2 = sc.nextLine();
        int pages2 = Integer.parseInt(sc.nextLine());
        Book book1 = new Book(title1, pages1);
        Book book2 = new Book(title2, pages2);
        Shelf shelf = new Shelf(book1, book2);
        System.out.println("Total pages: " + shelf.totalPages());
        System.out.println("Longest: " + shelf.longestTitle());
    }
}

