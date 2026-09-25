import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String brand = scanner.nextLine();
        int wattage = scanner.nextInt();
        int capacity = scanner.nextInt();
        
        WashingMachine washingMachine = new WashingMachine(brand, wattage, capacity);
        
        System.out.println(washingMachine.getInfo());
    }
}
