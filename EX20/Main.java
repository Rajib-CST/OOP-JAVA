import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusInput = scanner.nextDouble();
        
        Temperature temp = new Temperature();
        
        temp.setCelsius(celsiusInput);
        
        System.out.println("Valid: " + temp.isValid());
        
        System.out.println("Fahrenheit: " + String.format("%.1f", temp.getFahrenheit()));
    }
}
