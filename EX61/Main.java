import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String brand = scanner.nextLine();
        int volumeLevel = scanner.nextInt();
        
        // Create a SmartTV with the given brand
        SmartTV tv = new SmartTV(brand);
        
        // Call powerOn()
        tv.powerOn();
        
        // Call setVolume() with the given level
        tv.setVolume(volumeLevel);
        
        // Print: Current volume: [volume] using getVolume()
        System.out.println("Current volume: " + tv.getVolume());
        
        // Call powerOff()
        tv.powerOff();
    }
}
