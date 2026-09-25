import java.util.Scanner;

class PriceTable {
    private static int[] tierPrices;
    private static int totalTiers;
    private static int cheapestPrice;

    static {
        System.out.println("Loading price table...");
        totalTiers = 4;
        tierPrices = new int[totalTiers];
    }

    static {
        for (int i = 0; i < totalTiers; i++) {
            tierPrices[i] = (i + 1) * 25;
        }
        System.out.println("Price table ready");
    }

    static {
        cheapestPrice = tierPrices[0];
    }

    public static int priceForTier(int tier) {
        return tierPrices[tier - 1];
    }

    public static int getCheapestPrice() { return cheapestPrice; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tier = Integer.parseInt(sc.nextLine());
        System.out.println("Cheapest: " + PriceTable.getCheapestPrice());
        System.out.println("Tier " + tier + " price: " + PriceTable.priceForTier(tier));
    }
}
