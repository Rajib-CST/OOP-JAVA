import java.util.Scanner;

class Vehicle {
    private String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public String getBrand() { return this.brand; }
    public void start() { System.out.println(this.brand + " is starting"); }
}

class Truck extends Vehicle {
    private int capacityTons;
    public Truck(String brand, int capacityTons) {
        super(brand);
        this.capacityTons = capacityTons;
    }
    public String loadCargo(int tons) {
        if (tons <= this.capacityTons) {
            return getBrand() + " loaded with " + tons + " tons";
        }
        return getBrand() + " cannot carry " + tons + " tons (max " + this.capacityTons + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        int capacity = Integer.parseInt(sc.nextLine());
        int load1 = Integer.parseInt(sc.nextLine());
        int load2 = Integer.parseInt(sc.nextLine());
        Truck t = new Truck(brand, capacity);
        t.start();
        System.out.println(t.loadCargo(load1));
        System.out.println(t.loadCargo(load2));
    }
}
