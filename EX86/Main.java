import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String word = scanner.nextLine();
        int intValue = Integer.parseInt(scanner.nextLine());
        double doubleValue = Double.parseDouble(scanner.nextLine());
        
        // Create a Container<String> and add the word twice
        Container<String> stringContainer = new Container<>();
        stringContainer.add(word);
        stringContainer.add(word);
        System.out.println("String container:");
        ContainerUtils.printAll(stringContainer);
        
        // Create a Container<Double> and add the double value
        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(doubleValue);
        System.out.println();
        System.out.println("Number sum: " + ContainerUtils.countItems(doubleContainer));
        
        // Create a Container<Number> and call ContainerUtils.addDefaults() on it
        Container<Number> numberContainer = new Container<>();
        ContainerUtils.addDefaults(numberContainer);
        System.out.println();
        System.out.println("After adding defaults:");
        ContainerUtils.printAll(numberContainer);
        
        // Create an empty Container<Integer>
        Container<Integer> intContainer = new Container<>();
        int result = ContainerUtils.getLastOrDefault(intContainer, intValue);
        System.out.println();
        System.out.println("Last or default: " + result);
    }
}
