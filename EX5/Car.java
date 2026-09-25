public class Car {
    // TODO: Create String field 'brand'
    String brand;
    // TODO: Create int field 'year'
    int year;
    
    // TODO: Create a constructor that takes brand and year and assigns them
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // TODO: Create a method getInfo() that returns: "<brand> (<year>)"
    public String getInfo() {
        return brand + " (" + year + ")";
    }
}