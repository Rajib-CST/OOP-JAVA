import java.util.Scanner;

interface Flyable {
    String fly();
}

interface Swimmable {
    String swim();
}

class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public String describe() { return this.name + " is an animal"; }
}

class Bird extends Animal {
    public Bird(String name) { super(name); }
    public String chirp() { return this.name + " chirps"; }
}

class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String name) { super(name); }
    public String fly() { return this.name + " flies over the pond"; }
    public String swim() { return this.name + " swims across the pond"; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Duck duck = new Duck(sc.nextLine());
        System.out.println(duck.describe());
        System.out.println(duck.chirp());
        System.out.println(duck.fly());
        System.out.println(duck.swim());
    }
}
