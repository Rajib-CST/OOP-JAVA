import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        
        // Create a NumberStats<Integer> with the two integer values
        NumberStats<Integer> intStats = new NumberStats<>(int1, int2);
        System.out.println("Integer sum: " + intStats.getSum());
        System.out.println("Integer average: " + intStats.getAverage());
        
        // Create a NumberStats<Double> with the two double values
        NumberStats<Double> doubleStats = new NumberStats<>(double1, double2);
        System.out.println("Double sum: " + doubleStats.getSum());
        System.out.println("Double average: " + doubleStats.getAverage());
        
        // Create a ComparableBox<Integer> with the two integer values
        ComparableBox<Integer> intBox = new ComparableBox<>(int1, int2);
        System.out.println("Max integer: " + intBox.getMax());
        System.out.println("Max as double: " + intBox.getMaxAsDouble());
    }
}
