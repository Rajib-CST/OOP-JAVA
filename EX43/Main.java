import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String brand = scanner.nextLine();
        
        // Create a Gadget object with name and year
        Gadget gadget = new Gadget(name, year);
        
        // Create a Smartphone object with name, year, and brand
        Smartphone smartphone = new Smartphone(name, year, brand);
        
        // Print the gadget's class name using getClass().getSimpleName()
        System.out.println(gadget.getClass().getSimpleName());
        
        // Print whether gadget's toString() contains "@" (true or false)
        System.out.println(gadget.toString().contains("@"));
        
        // Print the smartphone (uses overridden toString())
        System.out.println(smartphone.toString());
        
    }
}
