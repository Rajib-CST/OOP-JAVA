import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String size = scanner.nextLine();
        String addCheese = scanner.nextLine();
        String addPepperoni = scanner.nextLine();
        String addMushrooms = scanner.nextLine();
        
        // Create a PizzaBuilder with the given size
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder(size);
        
        // Chain topping methods based on yes/no inputs
        if (addCheese.equals("yes")) {
            builder.cheese();
        }
        if (addPepperoni.equals("yes")) {
            builder.pepperoni();
        }
        if (addMushrooms.equals("yes")) {
            builder.mushrooms();
        }
        
        // Build the pizza and print its description
        Pizza pizza = builder.build();
        System.out.println(pizza.getDescription());
    }
}
