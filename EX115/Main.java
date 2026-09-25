import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        RentalAgency agency = new RentalAgency();
        
        String[] commands = input.split(",");
        
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];
            
            if (action.equals("ADD_CAR")) {
                String licensePlate = parts[1];
                String brand = parts[2];
                double dailyRate = Double.parseDouble(parts[3]);
                int seats = Integer.parseInt(parts[4]);
                Car car = new Car(licensePlate, brand, dailyRate, seats);
                agency.addVehicle(car);
                System.out.println("Added: " + brand + " (" + car.getVehicleType() + ")");
            } else if (action.equals("ADD_MOTORCYCLE")) {
                String licensePlate = parts[1];
                String brand = parts[2];
                double dailyRate = Double.parseDouble(parts[3]);
                int engineCC = Integer.parseInt(parts[4]);
                Motorcycle motorcycle = new Motorcycle(licensePlate, brand, dailyRate, engineCC);
                agency.addVehicle(motorcycle);
                System.out.println("Added: " + brand + " (" + motorcycle.getVehicleType() + ")");
            } else if (action.equals("RENT")) {
                String licensePlate = parts[1];
                int days = Integer.parseInt(parts[2]);
                try {
                    double cost = agency.rentVehicle(licensePlate, days);
                    System.out.printf("Rented %s for %d days - Total: $%.2f%n", licensePlate, days, cost);
                } catch (VehicleNotAvailableException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (action.equals("RETURN")) {
                String licensePlate = parts[1];
                boolean success = agency.returnVehicle(licensePlate);
                if (success) {
                    System.out.println("Returned: " + licensePlate);
                } else {
                    System.out.println("Return failed: " + licensePlate);
                }
            } else if (action.equals("AVAILABLE")) {
                System.out.println("Available vehicles:");
                ArrayList<Vehicle> available = agency.getAvailableVehicles();
                for (Vehicle v : available) {
                    System.out.println(v.getDetails());
                }
            }
        }
        
        System.out.println("--- Fleet Summary ---");
        ArrayList<Vehicle> allVehicles = agency.getAllVehicles();
        for (Vehicle v : allVehicles) {
            System.out.println(v.getDetails());
        }
    }
}
