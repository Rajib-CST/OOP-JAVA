import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        
        Rectangle rectangle = new Rectangle(width, height);
        
        Shape[] shapes = {circle, rectangle};
        
        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }
        
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        
        System.out.println("Total area: " + String.format("%.2f", totalArea));
    }
}
