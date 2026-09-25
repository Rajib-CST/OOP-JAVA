import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringHelper helper = new StringHelper(input);
        
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + helper.toUpperCase());
        System.out.println("Length: " + helper.getLength());
        System.out.println("Contains 'World': " + helper.contains("World"));
        System.out.println("Repeated: " + helper.repeat(3));
    }
}