class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String model, boolean hasSidecar) {
        super(model);
        this.hasSidecar = hasSidecar;
    }
    
    public void checkSidecar() {
        if (hasSidecar) {
            System.out.println(getModel() + " has a sidecar");
        } else {
            System.out.println(getModel() + " has no sidecar");
        }
    }
}
