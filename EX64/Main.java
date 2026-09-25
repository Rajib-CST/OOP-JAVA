import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String operation = scanner.nextLine();
        
        TextProcessor processor;
        
        if (operation.equals("upper")) {
            processor = new TextProcessor(s -> s.toUpperCase());
        } else if (operation.equals("lower")) {
            processor = new TextProcessor(s -> s.toLowerCase());
        } else {
            processor = new TextProcessor(s -> new StringBuilder(s).reverse().toString());
        }
        
        System.out.println("Result: " + processor.process(text));
    }
}
