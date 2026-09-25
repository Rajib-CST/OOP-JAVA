import java.util.List;

class ZooFeeder {
    
    public static void printInventory(List<?> items) {
        for (Object item : items) {
            System.out.println(item.toString());
        }
    }
    
    public static int calculateTotalFood(List<? extends Food> foods) {
        return foods.size();
    }
    
    public static void addMeatToStock(List<? super Meat> stock, String meatName) {
        stock.add(new Meat(meatName));
    }
}
