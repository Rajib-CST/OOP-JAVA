class Human implements Speaker {
    private String name;
    
    public Human(String name) {
        this.name = name;
    }
    
    @Override
    public String speak() {
        return name + " says: Hello everyone!";
    }
}
