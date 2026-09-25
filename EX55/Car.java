class Car extends Vehicle {
    private int numDoors;
    
    public Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }
    
    public void checkDoors() {
        System.out.println(getModel() + " has " + numDoors + " doors");
    }
}
