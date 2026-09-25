import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String brand1 = scanner.nextLine();
        int year1 = Integer.parseInt(scanner.nextLine());
        String brand2 = scanner.nextLine();
        int year2 = Integer.parseInt(scanner.nextLine());
        
        Car car1 = new Car(brand1, year1);
        Car car2 = new Car(brand2, year2);
        
        System.out.println("Car 1: " + car1.getInfo());
        System.out.println("Car 2: " + car2.getInfo());
        System.out.println("Same car? " + (car1 == car2));
    }
}