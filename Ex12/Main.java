import java.util.Scanner;

class StockItem {
    private String name;
    private int quantity;
    private double price;
    public StockItem(String name, int quantity, double price) {
        this.name = name; this.quantity = quantity; this.price = price;
    }
    public String getName() { return this.name; }
    public int getQuantity() { return this.quantity; }
    public boolean setPrice(double price) {
        if (price >= 0) { this.price = price; return true; }
        return false;
    }
    public double totalValue() { return this.quantity * this.price; }
    public String sell(int amount) {
        if (amount > this.quantity) { return "Out of stock"; }
        this.quantity -= amount;
        return "Sold " + amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double price = Double.parseDouble(sc.nextLine());
        double newPrice = Double.parseDouble(sc.nextLine());
        int sellAmount = Integer.parseInt(sc.nextLine());
        StockItem item = new StockItem(name, quantity, price);
        System.out.println("Item: " + item.getName());
        System.out.println("Initial value: " + item.totalValue());
        System.out.println("Price updated: " + item.setPrice(newPrice));
        System.out.println("Value after update: " + item.totalValue());
        System.out.println(item.sell(sellAmount));
        System.out.println("Remaining: " + item.getQuantity());
    }
}
