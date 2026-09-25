// Car extends Vehicle (IS-A relationship) and implements Convertible (CAN-DO capability)
class Car extends Vehicle implements Convertible {
    private int numDoors;
    
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }
    
    public String startEngine() {
        return brand + " car engine started";
    }
    
    public String openRoof() {
        return brand + " roof opening";
    }
    
    public String closeRoof() {
        return brand + " roof closing";
    }
}
