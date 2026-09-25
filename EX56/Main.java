import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String brand1 = scanner.nextLine();
        int wattage1 = scanner.nextInt();
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String brand2 = scanner.nextLine();
        int power = scanner.nextInt();
        
        WashingMachine washingMachine = new WashingMachine(brand1, wattage1, capacity);
        
        Microwave microwave = new Microwave(brand2, wattage1, power);
        
        Appliance[] appliances = {washingMachine, microwave};
        
        for (Appliance appliance : appliances) {
            System.out.println(appliance.getInfo());
            appliance.operate();
        }
    }
}
