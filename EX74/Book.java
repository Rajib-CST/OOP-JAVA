import java.util.Objects;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getYear() {
        return year;
    }
    
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.year, other.year);
    }
    
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}