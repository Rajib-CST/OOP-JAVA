class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }
    
    public String getDescription() {
        StringBuilder toppings = new StringBuilder();
        
        if (cheese) {
            toppings.append("Cheese");
        }
        if (pepperoni) {
            if (toppings.length() > 0) {
                toppings.append(", ");
            }
            toppings.append("Pepperoni");
        }
        if (mushrooms) {
            if (toppings.length() > 0) {
                toppings.append(", ");
            }
            toppings.append("Mushrooms");
        }
        
        String toppingsStr = toppings.length() > 0 ? toppings.toString() : "no toppings";
        return size + " Pizza with: " + toppingsStr;
    }
    
    public static class PizzaBuilder {
        private final String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        
        public PizzaBuilder(String size) {
            this.size = size;
            this.cheese = false;
            this.pepperoni = false;
            this.mushrooms = false;
        }
        
        public PizzaBuilder cheese() {
            this.cheese = true;
            return this;
        }
        
        public PizzaBuilder pepperoni() {
            this.pepperoni = true;
            return this;
        }
        
        public PizzaBuilder mushrooms() {
            this.mushrooms = true;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
