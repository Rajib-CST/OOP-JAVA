import java.util.Scanner;

class Robot {
    private String name;
    private int battery;

    public Robot(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    public String describe() {
        return this.name;
    }

    public String status() {
        if (this.battery < 20) {
            return "Low battery";
        }
        return "Battery level: " + this.battery;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int battery = Integer.parseInt(sc.nextLine());
        Robot robot = new Robot(name, battery);
        System.out.println("Robot: " + robot.describe());
        System.out.println(robot.status());
    }
}
