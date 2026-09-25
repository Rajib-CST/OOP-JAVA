import java.util.Scanner;

class Catalog {
    public String describe(String item) { return "Item: " + item; }
    public String describe(String item, int quantity) { return "Item: " + item + " x" + quantity; }
    public String describe(int quantity, String item) { return quantity + " units of " + item; }
    public String describe(String item, String unit) { return "Item: " + item + " (" + unit + ")"; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        String unit = sc.nextLine();
        Catalog c = new Catalog();
        System.out.println(c.describe(item));
        System.out.println(c.describe(item, quantity));
        System.out.println(c.describe(quantity, item));
        System.out.println(c.describe(item, unit));
    }
}
