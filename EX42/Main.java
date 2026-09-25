import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int warrantyYears = scanner.nextInt();
        
        Electronics electronics = new Electronics(name, price, warrantyYears);
        
        System.out.println(electronics.getDetails());
    }
}
