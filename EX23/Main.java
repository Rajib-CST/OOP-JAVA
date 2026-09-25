import java.util.Scanner;

class Vault {
    private String pin;
    private int attempts;
    private boolean locked;
    public boolean setPin(String pin) {
        if (pin.length() != 4) return false;
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) return false;
        }
        this.pin = pin;
        return true;
    }
    public String unlock(String attempt) {
        if (this.locked) return "Locked";
        if (attempt.equals(this.pin)) { this.attempts = 0; return "Unlocked"; }
        this.attempts++;
        if (this.attempts >= 3) { this.locked = true; return "Locked"; }
        return "Wrong PIN";
    }
    public boolean isLocked() { return this.locked; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pinToSet = sc.nextLine();
        String attempt1 = sc.nextLine();
        String attempt2 = sc.nextLine();
        String attempt3 = sc.nextLine();
        Vault vault = new Vault();
        System.out.println("Set: " + vault.setPin(pinToSet));
        System.out.println(vault.unlock(attempt1));
        System.out.println(vault.unlock(attempt2));
        System.out.println(vault.unlock(attempt3));
        System.out.println("Locked: " + vault.isLocked());
    }
}
