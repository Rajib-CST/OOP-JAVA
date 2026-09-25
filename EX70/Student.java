import java.util.Objects;

class Student {
    // TODO: Declare three private fields: studentId (String), name (String), gpa (double)
    private String studentId;
    private String name;
    private double gpa;

    // TODO: Create a constructor that initializes all three fields
    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // TODO: Create getter methods for each field
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // TODO: Override equals() method
    // - Check if comparing to same reference (return true)
    // - Check if other is null or different class (return false)
    // - Cast and compare studentId AND name fields
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name);
    }

    // TODO: Override hashCode() method
    // - Use Objects.hash() with the same fields used in equals()
    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }
}
