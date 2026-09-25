import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        scanner.close();

        Motorcycle motorcycle = new Motorcycle(brand);

        // Inherited method from Vehicle
        motorcycle.start();

        // Specialized method in Motorcycle
        motorcycle.wheelie();
    }
}