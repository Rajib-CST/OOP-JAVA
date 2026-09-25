import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        
        // Create an OldBox storing the word
        // Retrieve with cast to String and print: "OldBox (with cast): [value]"
        OldBox oldBox = new OldBox(word);
        String oldValue = (String) oldBox.getContent();
        System.out.println("OldBox (with cast): " + oldValue);
        
        // Create a GenericBox<String> storing the word
        // Retrieve without casting and print: "GenericBox (no cast): [value]"
        GenericBox<String> stringBox = new GenericBox<String>(word);
        String stringValue = stringBox.getContent();
        System.out.println("GenericBox (no cast): " + stringValue);
        
        // Create a GenericBox<Integer> storing the number
        // Retrieve and print: "GenericBox Integer: [value]"
        GenericBox<Integer> intBox = new GenericBox<Integer>(number);
        Integer intValue = intBox.getContent();
        System.out.println("GenericBox Integer: " + intValue);
        
        // Print a blank line, then print:
        // "Type safety: Generics catch errors at compile time!"
        System.out.println();
        System.out.println("Type safety: Generics catch errors at compile time!");
    }
}
