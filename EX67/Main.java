import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String operation = scanner.next();

        NumberProcessor processor;

        if (operation.equals("double")) {
            processor = new NumberProcessor(n -> n * 2);
        } else if (operation.equals("square")) {
            processor = new NumberProcessor(n -> n * n);
        } else {
            processor = new NumberProcessor(n -> n + 10);
        }

        System.out.println("Result: " + processor.process(number));
    }
}
