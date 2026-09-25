import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();
        
        // Use MathUtils static methods to calculate and print:
        System.out.println("Square: " + MathUtils.square(number));
        System.out.println("Cube: " + MathUtils.cube(number));
        System.out.println("Circle area (radius=" + number + "): " + String.format("%.2f", MathUtils.circleArea(number)));
        
        // Create 'count' number of Counter objects
        for (int i = 0; i < count; i++) {
            Counter c = new Counter();
            System.out.println("Counter " + c.getId() + " created");
        }
        
        // Print the total number of counters created
        System.out.println("Total counters: " + Counter.getTotalCount());
    }
}
