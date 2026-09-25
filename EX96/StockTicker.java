import java.util.ArrayList;
import java.util.List;

class StockTicker {
    private String stockName;
    private double price = 0;
    private List<Observer> observers = new ArrayList<>();
    
    public StockTicker(String stockName) {
        this.stockName = stockName;
    }
    
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    
    public void setPrice(double price) {
        this.price = price;
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
