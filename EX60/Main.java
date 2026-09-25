import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String humanName = scanner.nextLine();
        String robotModel = scanner.nextLine();
        
        // Create a Human object with the given name
        Human human = new Human(humanName);
        
        // Create a Robot object with the given model
        Robot robot = new Robot(robotModel);
        
        // Create an array of Speaker references containing both objects
        Speaker[] speakers = {human, robot};
        
        // Loop through the array and print the result of speak() for each speaker
        for (Speaker speaker : speakers) {
            System.out.println(speaker.speak());
        }
    }
}
