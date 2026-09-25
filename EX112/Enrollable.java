// Interface defining the contract for enrollment operations

public interface Enrollable {
    boolean enroll(Student student);
    
    int getEnrolledCount();
}
