class Robot implements Speaker {
    private String model;
    
    public Robot(String model) {
        this.model = model;
    }
    
    @Override
    public String speak() {
        return "Robot " + model + " says: Beep boop!";
    }
}
