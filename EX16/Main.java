import java.util.Scanner;

class Ticket {
    private String eventName;
    private double price;
    private boolean vip;

    public Ticket(String eventName, double price, boolean vip) {
        this.eventName = eventName; this.price = price; this.vip = vip;
    }
    public Ticket(String eventName, double price) { this(eventName, price, false); }
    public Ticket(String eventName) { this(eventName, 20.0); }
    public Ticket() { this("General Admission"); }

    public String getEventName() { return this.eventName; }
    public double getFinalPrice() {
        if (this.vip) { return this.price * 1.5; }
        return this.price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        double price1 = Double.parseDouble(sc.nextLine());
        boolean vip1 = Boolean.parseBoolean(sc.nextLine());
        String name2 = sc.nextLine();
        double price2 = Double.parseDouble(sc.nextLine());
        String name3 = sc.nextLine();
        Ticket t1 = new Ticket(name1, price1, vip1);
        Ticket t2 = new Ticket(name2, price2);
        Ticket t3 = new Ticket(name3);
        Ticket t4 = new Ticket();
        System.out.println("Ticket 1: " + t1.getEventName() + " - $" + t1.getFinalPrice());
        System.out.println("Ticket 2: " + t2.getEventName() + " - $" + t2.getFinalPrice());
        System.out.println("Ticket 3: " + t3.getEventName() + " - $" + t3.getFinalPrice());
        System.out.println("Ticket 4: " + t4.getEventName() + " - $" + t4.getFinalPrice());
    }
}
