class DayTrader implements Observer {
    private String name;
    
    public DayTrader(String name) {
        this.name = name;
    }
    
    public void update(String stockName, double price) {
        System.out.println(name + " received alert: " + stockName + " is now $" + String.format("%.2f", price) + " - Making quick trade!");
    }
}

class LongTermInvestor implements Observer {
    private String name;
    
    public LongTermInvestor(String name) {
        this.name = name;
    }
    
    public void update(String stockName, double price) {
        System.out.println(name + " received alert: " + stockName + " is now $" + String.format("%.2f", price) + " - Holding steady.");
    }
}
