class ShoppingCart {
    private String customerName;
    
    public ShoppingCart(String customerName) {
        this.customerName = customerName;
    }
    
    class Item {
        private String name;
        private double price;
        
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
        
        public String getDetails() {
            return name + ": $" + price;
        }
    }
    
    public String checkout(Item item, double discount) {
        class DiscountCalculator {
            double applyDiscount(double originalPrice) {
                return originalPrice - (originalPrice * discount / 100);
            }
        }
        
        DiscountCalculator calculator = new DiscountCalculator();
        double finalPrice = calculator.applyDiscount(item.price);
        
        Formatter formatter = new Formatter() {
            @Override
            public String format() {
                return "--- Receipt ---\n" +
                       "Customer: " + customerName + "\n" +
                       "Item: " + item.getDetails() + "\n" +
                       "Discount: " + discount + "%\n" +
                       "Final Price: $" + finalPrice;
            }
        };
        
        return formatter.format();
    }
}
