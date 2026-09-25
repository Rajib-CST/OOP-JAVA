// Abstract base class that defines the template method
abstract class DocumentGenerator {
    
    // Final method that defines the algorithm skeleton
    public final void generateDocument() {
        createHeader();
        createBody();
        createFooter();
    }
    
    // Abstract method createHeader()
    abstract void createHeader();
    
    // Abstract method createBody()
    abstract void createBody();
    
    // Hook method createFooter() with default implementation
    void createFooter() {
        System.out.println("--- End of Document ---");
    }
    
}
