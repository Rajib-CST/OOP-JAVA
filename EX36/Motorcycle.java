class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    
    public void wheelie() {
        System.out.println(getBrand() + " is doing a wheelie!");
    }
}
