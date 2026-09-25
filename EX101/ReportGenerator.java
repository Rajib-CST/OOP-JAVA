// Concrete subclass for generating reports
class ReportGenerator extends DocumentGenerator {
    
    // Private field to store the report title
    private String title;
    
    // Constructor that takes a report title (String)
    public ReportGenerator(String title) {
        this.title = title;
    }
    
    // Implement createHeader() to print: === REPORT: [title] ===
    void createHeader() {
        System.out.println("=== REPORT: " + title + " ===");
    }
    
    // Implement createBody() to print: Report content goes here...
    void createBody() {
        System.out.println("Report content goes here...");
    }
    
    // Note: Use the inherited default footer (no need to override createFooter)
    
}
