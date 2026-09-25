import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        
        // Create a String[] array containing both words
        String[] words = {firstWord, secondWord};
        
        // Use ArrayUtils.getLast to get the last element
        // Print: "Last word: [result]"
        String lastWord = ArrayUtils.getLast(words);
        System.out.println("Last word: " + lastWord);
        
        // Create an Integer[] array containing both numbers
        Integer[] numbers = {firstNumber, secondNumber};
        
        // Call ArrayUtils.swap to swap elements at indices 0 and 1
        ArrayUtils.swap(numbers, 0, 1);
        // Print: "After swap: [first], [second]"
        System.out.println("After swap: " + numbers[0] + ", " + numbers[1]);
        
        // Call ArrayUtils.printWithLabel with firstWord as label and firstNumber as value
        ArrayUtils.printWithLabel(firstWord, firstNumber);
        
        // Call ArrayUtils.printWithLabel with firstNumber as label and secondWord as value
        ArrayUtils.printWithLabel(firstNumber, secondWord);
    }
}
