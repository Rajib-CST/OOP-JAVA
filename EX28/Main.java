import java.util.Scanner;

class Pallet {
    private String id;
    private int boxes;
    private static int warehouseCapacity = 100, spaceUsed = 0;

    public Pallet(String id, int boxes) {
        this.id = id; this.boxes = boxes; spaceUsed += boxes;
    }

    public String getId() { return this.id; }
    public int getBoxes() { return this.boxes; }

    public String remove(int count) {
        this.boxes -= count; spaceUsed -= count;
        return "Removed " + count + " boxes from " + this.id;
    }

    public static int getRemainingCapacity() { return warehouseCapacity - spaceUsed; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id1 = sc.nextLine(); int boxes1 = Integer.parseInt(sc.nextLine());
        String id2 = sc.nextLine(); int boxes2 = Integer.parseInt(sc.nextLine());
        int removeCount = Integer.parseInt(sc.nextLine());
        Pallet p1 = new Pallet(id1, boxes1);
        Pallet p2 = new Pallet(id2, boxes2);
        System.out.println(p1.getId() + ": " + p1.getBoxes() + " boxes");
        System.out.println(p2.getId() + ": " + p2.getBoxes() + " boxes");
        System.out.println("Remaining capacity: " + Pallet.getRemainingCapacity());
        System.out.println(p1.remove(removeCount));
        System.out.println("Remaining capacity: " + Pallet.getRemainingCapacity());
    }
}
