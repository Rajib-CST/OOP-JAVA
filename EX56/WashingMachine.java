class WashingMachine extends Appliance {
    private int capacity;
    
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }
    
    @Override
    public void operate() {
        System.out.println(brand + " washing machine is washing " + capacity + "kg of clothes");
    }
}
