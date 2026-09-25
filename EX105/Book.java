class Book {
    // Private fields
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    
    // Constructor that accepts isbn, title, and author
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    // Getter methods for all fields
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // Setter for isAvailable
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    
    // getDetails() method
    // Returns: "[isbn] title by author"
    public String getDetails() {
        return "[" + isbn + "] " + title + " by " + author;
    }
}
