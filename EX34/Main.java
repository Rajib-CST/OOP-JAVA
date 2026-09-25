import java.util.Scanner;

class ShippingRates {
    public static final double BASE_RATE = 5.0;
    public static final double PER_KG_RATE = 2.5;
    public static final double EXPRESS_MULTIPLIER = 1.5;
    public static final int FREE_THRESHOLD_KG = 20;
}

class ShippingCalculator {
    public static double cost(double weightKg, boolean express) {
        if (weightKg >= ShippingRates.FREE_THRESHOLD_KG) {
            return 0.0;
        }
        double total = ShippingRates.BASE_RATE + ShippingRates.PER_KG_RATE * weightKg;
        if (express) {
            total = total * ShippingRates.EXPRESS_MULTIPLIER;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = Double.parseDouble(sc.nextLine());
        boolean express = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Threshold: " + ShippingRates.FREE_THRESHOLD_KG + " kg");
        System.out.printf("Shipping cost: $%.2f%n", ShippingCalculator.cost(weight, express));
    }
}
