class BookNotAvailableException extends LibraryException {
    public BookNotAvailableException(String isbn) {
        super("Book not available: " + isbn);
    }
}
