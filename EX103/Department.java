import java.util.ArrayList;
import java.util.List;

class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> children;
    
    public Department(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    public void add(OrganizationComponent component) {
        children.add(component);
    }
    
    public void showDetails(String indent) {
        System.out.println(indent + name + " Department");
        for (OrganizationComponent child : children) {
            child.showDetails(indent + "  ");
        }
    }
    
    public int getSalary() {
        int total = 0;
        for (OrganizationComponent child : children) {
            total += child.getSalary();
        }
        return total;
    }
}
