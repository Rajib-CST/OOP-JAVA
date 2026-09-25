import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        
        Calculator calc = new Calculator(name);
        
        System.out.println("Calculator: " + calc.getName());
        System.out.println("Memory: " + calc.getMemory());
        
        System.out.println("Add: " + calc.add(num1, num2));
        System.out.println("Subtract: " + calc.subtract(num1, num2));
        System.out.println("Multiply: " + calc.multiply(num1, num2));
        System.out.println("Divide: " + calc.divide(num1, num2));
        System.out.println("Divide by zero: " + calc.divide(num1, 0));
        System.out.println("Memory: " + calc.getMemory());
        System.out.println("Power: " + calc.power(num1, num2));
        System.out.println("Operations: " + calc.getOperationCount());
    }
}