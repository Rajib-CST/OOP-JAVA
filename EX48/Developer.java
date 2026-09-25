// Developer class that extends Employee
class Developer extends Employee {
    private String language;
    
    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }
    
    @Override
    public void work() {
        System.out.println(name + " is coding in " + language);
    }
    
    public String getDeveloperDetails() {
        return "Developer: " + name + " earns $" + String.format("%.2f", salary) + ", Language: " + language;
    }
}
