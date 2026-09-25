// Manager class that extends Employee
class Manager extends Employee {
    private int teamSize;
    
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize);
    }
    
    public String getManagerDetails() {
        return "Manager: " + name + " earns $" + String.format("%.2f", salary) + ", Team size: " + teamSize;
    }
}
