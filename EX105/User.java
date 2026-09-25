class User {
    // Private fields
    private String id;
    private String name;
    
    // Constructor that accepts id and name
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Getter methods
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    // Override toString() method
    // Returns: "User[id]: name"
    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
