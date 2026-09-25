import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String recipientName = scanner.nextLine();
        String giftDescription = scanner.nextLine();
        int giftValue = scanner.nextInt();
        
        // Create a GiftBox<String> containing the gift description
        GiftBox<String> stringBox = new GiftBox<>(giftDescription);
        // Wrap it using the wrap() method
        stringBox.wrap();
        // Print its status using getStatus()
        System.out.println(stringBox.getStatus());
        
        // Create a GiftBox<Integer> containing the gift value
        GiftBox<Integer> intBox = new GiftBox<>(giftValue);
        // Don't wrap this one - print its status (should show unwrapped)
        System.out.println(intBox.getStatus());
        
        // Create a Registry<String, String> pairing recipient with gift description
        Registry<String, String> registry = new Registry<>(recipientName, giftDescription);
        // Print the registry entry using getEntry()
        System.out.println(registry.getEntry());
    }
}
