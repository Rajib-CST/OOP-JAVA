import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two shape types
        String type1 = scanner.nextLine();
        String type2 = scanner.nextLine();
        
        // Use ShapeFactory to create the first shape
        Shape shape1 = ShapeFactory.createShape(type1);
        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("Unknown shape: " + type1);
        }
        
        // Do the same for the second shape
        Shape shape2 = ShapeFactory.createShape(type2);
        if (shape2 != null) {
            shape2.draw();
        } else {
            System.out.println("Unknown shape: " + type2);
        }
        
    }
}
