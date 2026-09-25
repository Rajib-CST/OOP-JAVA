import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        
        System.out.println("Switchable methods: turnOn, turnOff");
        System.out.println("Adjustable methods: setLevel");
        System.out.println("Max level constant: " + Adjustable.MAX_LEVEL);
        System.out.println("Setting level to: " + level);
        
    }
}
