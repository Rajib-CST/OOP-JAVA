import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    
    public Library() {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void registerUser(User user) {
        users.add(user);
    }
    
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    
    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
    
    public void borrowBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);
        
        if (user == null || book == null) {
            System.out.println("Invalid user or book");
            return;
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book not available");
            return;
        }
        
        user.borrowBook(book);
        System.out.println(user.getName() + " borrowed " + book.getTitle());
    }
    
    public void returnBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);
        
        if (user == null || book == null) {
            System.out.println("Invalid user or book");
            return;
        }
        
        user.returnBook(book);
        System.out.println(user.getName() + " returned " + book.getTitle());
    }
}
