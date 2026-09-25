import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        
        // TODO: Create a Product object with the input values
        Product product = new Product(name, price, quantity);
        // TODO: Print the product object directly
        
        // (This will automatically call your toString() method!)
        System.out.println(product);
    }
}
