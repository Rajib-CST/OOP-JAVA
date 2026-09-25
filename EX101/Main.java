import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String reportTitle = scanner.nextLine();
        String customerName = scanner.nextLine();
        double invoiceAmount = scanner.nextDouble();
        
        // Create a ReportGenerator with the title and call generateDocument()
        ReportGenerator report = new ReportGenerator(reportTitle);
        report.generateDocument();
        
        // Print an empty line for separation
        System.out.println();
        
        // Create an InvoiceGenerator with customer name and amount, and call generateDocument()
        InvoiceGenerator invoice = new InvoiceGenerator(customerName, invoiceAmount);
        invoice.generateDocument();
        
    }
}
