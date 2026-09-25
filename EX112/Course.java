import java.util.ArrayList;

// Class representing a course, implements Enrollable

public class Course implements Enrollable {
    private String courseId;
    private String title;
    private Instructor instructor;
    private ArrayList<Student> enrolledStudents;
    
    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }
    
    @Override
    public boolean enroll(Student student) {
        enrolledStudents.add(student);
        student.addCourse(courseId);
        return true;
    }
    
    @Override
    public int getEnrolledCount() {
        return enrolledStudents.size();
    }
    
    public String getDetails() {
        return "[" + courseId + "] " + title + " by " + instructor.getName();
    }
    
    public String getCourseId() {
        return courseId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Instructor getInstructor() {
        return instructor;
    }
}
