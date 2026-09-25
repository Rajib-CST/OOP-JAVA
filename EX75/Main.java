import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String processorBrand = scanner.nextLine();
        double processorSpeed = Double.parseDouble(scanner.nextLine());
        String memoryType = scanner.nextLine();
        int memorySize = Integer.parseInt(scanner.nextLine());
        
        Processor processor = new Processor(processorBrand, processorSpeed);
        
        Memory memory = new Memory(memoryType, memorySize);
        
        Computer computer = new Computer(processor, memory);
        
        System.out.println(computer.boot());
        
        System.out.println(computer.getSpecs());
    }
}
