// Professor class - exists independently of any course (used in aggregation)
class Professor {
    private String name;
    private String department;
    
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    @Override
    public String toString() {
        return "Prof. " + name + " (" + department + ")";
    }
}