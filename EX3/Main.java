import java.util.Scanner;
//import Animal;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        Animal animal = new Animal(name);
        
        System.out.println("Animal name: " + animal.name);
        System.out.println(animal.makeSound());
    }
}