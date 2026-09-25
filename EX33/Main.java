import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        
        double area = MathConstants.PI * radius * radius;
        
        double circumference = 2 * MathConstants.PI * radius;
        
        double goldenDiameter = 2 * radius * MathConstants.GOLDEN_RATIO;
        
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Circumference: " + String.format("%.2f", circumference));
        System.out.println("Golden Diameter: " + String.format("%.2f", goldenDiameter));
    }
}