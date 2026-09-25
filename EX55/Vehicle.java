class Vehicle {
    private String model;
    
    public Vehicle(String model) {
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
    
    public void inspect() {
        System.out.println("Inspecting vehicle: " + model);
    }
}
