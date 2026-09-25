import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String brand = scanner.nextLine();
        int wheels = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String model = scanner.nextLine();
        
        Car car = new Car(brand, wheels, model);
        
        car.move();
        
        car.honk();
        
        car.displayInfo();
    }
}
