import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String customerName = scanner.nextLine();
        String sizeName = scanner.nextLine();
        
        // Convert sizeName to CoffeeSize enum using valueOf()
        CoffeeSize size = CoffeeSize.valueOf(sizeName);
        
        // Create an Order with the customer name and size
        Order order = new Order(customerName, size);
        
        // Print the receipt
        System.out.println(order.getReceipt());
        
        // Print an empty line
        System.out.println();
        
        // Display the full menu by iterating through all CoffeeSize values
        for (CoffeeSize coffeeSize : CoffeeSize.values()) {
            System.out.println(coffeeSize.getDescription());
        }
        
    }
}
