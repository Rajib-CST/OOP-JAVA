import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String customerName = scanner.nextLine();
        String itemName = scanner.nextLine();
        double itemPrice = scanner.nextDouble();
        
        double discount = 10.0;
        
        // Create a ShoppingCart with the customer name
        ShoppingCart cart = new ShoppingCart(customerName);
        
        // Create an Item using: cart.new Item(itemName, itemPrice)
        ShoppingCart.Item item = cart.new Item(itemName, itemPrice);
        
        // Call checkout() with the item and discount, then print the result
        String receipt = cart.checkout(item, discount);
        System.out.println(receipt);
    }
}
