import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void printReport() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Square: " + isSquare());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        Rectangle rect = new Rectangle(width, height);
        rect.printReport();
    }
}
