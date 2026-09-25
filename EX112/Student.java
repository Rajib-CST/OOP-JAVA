import java.util.ArrayList;

// Class representing a student, extends User

public class Student extends User {
    private ArrayList<String> enrolledCourseIds;
    
    public Student(String id, String name) {
        super(id, name);
        this.enrolledCourseIds = new ArrayList<>();
    }
    
    @Override
    public String getRole() {
        return "Student";
    }
    
    public void addCourse(String courseId) {
        enrolledCourseIds.add(courseId);
    }
    
    public int getEnrolledCourseCount() {
        return enrolledCourseIds.size();
    }
    
    @Override
    public String toString() {
        return "Student: " + getName() + " (" + getEnrolledCourseCount() + " courses)";
    }
}
