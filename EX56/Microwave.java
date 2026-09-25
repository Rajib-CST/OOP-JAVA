class Microwave extends Appliance {
    private int power;
    
    public Microwave(String brand, int wattage, int power) {
        super(brand, wattage);
        this.power = power;
    }
    
    @Override
    public void operate() {
        System.out.println(brand + " microwave is heating at " + power + "% power");
    }
}
