class Book {
    // Private fields
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String borrowedBy;
    
    // Constructor that accepts isbn, title, and author
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowedBy = null;
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
    
    public String getBorrowedBy() {
        return borrowedBy;
    }
    
    // Setter for isAvailable
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    
    // Setter for borrowedBy that also updates isAvailable
    public void setBorrowedBy(String userId) {
        this.borrowedBy = userId;
        if (userId != null) {
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }
    
    // getDetails() method
    // Returns: "[isbn] title by author"
    public String getDetails() {
        return "[" + isbn + "] " + title + " by " + author;
    }
}
