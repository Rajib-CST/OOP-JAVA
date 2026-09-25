class Book {
    private String title;
    
    private double price;
    
    private static int totalBooks;
    
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        totalBooks++;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }
}
