// Class representing an instructor, extends User

public class Instructor extends User {
    private String specialty;
    
    public Instructor(String id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }
    
    @Override
    public String getRole() {
        return "Instructor";
    }
    
    public String getSpecialty() {
        return specialty;
    }
    
    @Override
    public String toString() {
        return "Instructor: " + getName() + " - " + specialty;
    }
}
