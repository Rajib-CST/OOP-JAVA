// Base class for all food types
class Food {
    private String name;
    
    public Food(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Meat extends Food {
    public Meat(String name) {
        super(name);
    }
}

class Vegetable extends Food {
    public Vegetable(String name) {
        super(name);
    }
}
