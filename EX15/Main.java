import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int stock = Integer.parseInt(scanner.nextLine());
        
        Product product1 = new Product(name, price, stock);
        Product product2 = new Product("Keyboard", 79.99);
        Product product3 = new Product();
        
        System.out.println("Product 1: " + product1.getName() + " - $" + product1.getPrice() + " (Stock: " + product1.getStock() + ")");
        System.out.println("Product 2: " + product2.getName() + " - $" + product2.getPrice() + " (Stock: " + product2.getStock() + ")");
        System.out.println("Product 3: " + product3.getName() + " - $" + product3.getPrice() + " (Stock: " + product3.getStock() + ")");
    }
}