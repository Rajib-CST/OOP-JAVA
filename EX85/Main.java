import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meatName = scanner.nextLine();
        String vegetableName = scanner.nextLine();
        
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(new Meat(meatName));
        foodList.add(new Vegetable(vegetableName));
        
        System.out.println("Food inventory:");
        ZooFeeder.printInventory(foodList);
        
        System.out.println();
        System.out.println("Total food items: " + ZooFeeder.calculateTotalFood(foodList));
        
        ArrayList<Food> meatStock = new ArrayList<>();
        
        System.out.println();
        System.out.println("Adding to meat stock...");
        
        ZooFeeder.addMeatToStock(meatStock, "Beef");
        
        System.out.println("Meat stock after adding:");
        ZooFeeder.printInventory(meatStock);
    }
}
