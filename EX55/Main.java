import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String carModel = scanner.nextLine();
        int numDoors = Integer.parseInt(scanner.nextLine());
        String motorcycleModel = scanner.nextLine();
        boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
        
        Car car = new Car(carModel, numDoors);
        
        Motorcycle motorcycle = new Motorcycle(motorcycleModel, hasSidecar);
        
        Vehicle[] vehicles = {car, motorcycle};
        
        for (Vehicle vehicle : vehicles) {
            vehicle.inspect();
            if (vehicle instanceof Car) {
                Car c = (Car) vehicle;
                c.checkDoors();
            }
            if (vehicle instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) vehicle;
                m.checkSidecar();
            }
        }
    }
}
