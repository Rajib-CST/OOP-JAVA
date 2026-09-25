import java.util.Scanner;

class Wallet {
    private String owner;
    private double balance;

    public Wallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public String getOwner() { return this.owner; }
    public double getBalance() { return this.balance; }

    public String transferTo(Wallet other, double amount) {
        if (amount > this.balance) {
            return "Failed: insufficient funds";
        }
        this.balance = this.balance - amount;
        other.balance = other.balance + amount;
        return this.owner + " sent " + amount + " to " + other.owner;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String owner1 = sc.nextLine();
        double balance1 = Double.parseDouble(sc.nextLine());
        String owner2 = sc.nextLine();
        double balance2 = Double.parseDouble(sc.nextLine());
        double amount = Double.parseDouble(sc.nextLine());

        Wallet w1 = new Wallet(owner1, balance1);
        Wallet w2 = new Wallet(owner2, balance2);

        System.out.println(w1.transferTo(w2, amount));
        System.out.println(w1.getOwner() + ": " + w1.getBalance());
        System.out.println(w2.getOwner() + ": " + w2.getBalance());
    }
}
