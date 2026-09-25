import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogName = scanner.nextLine();
        int dogAge = scanner.nextInt();
        scanner.nextLine();
        String dogBreed = scanner.nextLine();
        String birdName = scanner.nextLine();
        int birdAge = scanner.nextInt();

        Dog dog = new Dog(dogName, dogAge, dogBreed);
        Bird bird = new Bird(birdName, birdAge, true);

        System.out.println(dog.getInfo());
        System.out.println(dog.makeSound());
        System.out.println(dog.swim());

        System.out.println(bird.getInfo());
        System.out.println(bird.makeSound());
        System.out.println(bird.flyStatus());
    }
}
