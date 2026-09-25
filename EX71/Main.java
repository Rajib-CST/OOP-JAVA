import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int version = scanner.nextInt();
        
        // Create an original Document with the input values
        Document original = new Document(title, author, version);
        
        // Clone the original document to create a copy
        Document clone = original.clone();
        
        // Modify the clone's version by incrementing it by 1
        clone.setVersion(clone.getVersion() + 1);
        
        // Print "Original: " followed by the original document
        System.out.println("Original: " + original);
        
        // Print "Clone: " followed by the cloned document
        System.out.println("Clone: " + clone);
        
        // Print "Independent: " followed by true/false (check if original != clone)
        System.out.println("Independent: " + (original != clone));
        
    }
}