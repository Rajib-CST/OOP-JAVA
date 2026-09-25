public class Book {
    private String title;
    private String author;
    private int pages;
    
    // Constructor that takes title, author, and pages
    // Uses 'this' keyword to assign each parameter to its field
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    // getTitle() getter
    public String getTitle() {
        return this.title;
    }
    
    // getAuthor() getter
    public String getAuthor() {
        return this.author;
    }
    
    // getPages() getter
    public int getPages() {
        return this.pages;
    }
    
    // getSummary() method that returns: "<title> by <author> (<pages> pages)"
    public String getSummary() {
        return this.title + " by " + this.author + " (" + this.pages + " pages)";
    }
}