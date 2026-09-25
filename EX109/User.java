import java.util.ArrayList;

class User {
    // Private fields
    private String id;
    private String name;
    private ArrayList<Book> borrowedBooks;
    
    // Constructor that accepts id and name
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }
    
    // Getter methods
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    // borrowBook method
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowedBy(this.id);
    }
    
    // returnBook method
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowedBy(null);
    }
    
    // getBorrowedCount method
    public int getBorrowedCount() {
        return borrowedBooks.size();
    }
    
    // Override toString() method
    // Returns: "User[id]: name"
    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
