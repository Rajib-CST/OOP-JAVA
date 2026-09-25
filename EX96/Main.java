import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String stockName = scanner.nextLine();
        double firstPrice = scanner.nextDouble();
        double secondPrice = scanner.nextDouble();
        
        StockTicker ticker = new StockTicker(stockName);
        
        DayTrader alice = new DayTrader("Alice");
        
        LongTermInvestor bob = new LongTermInvestor("Bob");
        
        ticker.subscribe(alice);
        ticker.subscribe(bob);
        
        ticker.setPrice(firstPrice);
        
        ticker.unsubscribe(alice);
        
        ticker.setPrice(secondPrice);
        
        scanner.close();
    }
}
