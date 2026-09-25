class Student {
    // Declare a final field for studentId (String)
    private final String studentId;
    
    // Declare a final field for enrollmentYear (int)
    private final int enrollmentYear;
    
    // Declare a private field for name (String) - this one is NOT final
    private String name;
    
    // Constructor that takes studentId, name, and enrollmentYear
    // and initializes all fields
    public Student(String studentId, String name, int enrollmentYear) {
        this.studentId = studentId;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }
    
    // Getter getStudentId()
    public String getStudentId() {
        return studentId;
    }
    
    // Getter getEnrollmentYear()
    public int getEnrollmentYear() {
        return enrollmentYear;
    }
    
    // Getter getName()
    public String getName() {
        return name;
    }
    
    // Setter setName(String name)
    public void setName(String name) {
        this.name = name;
    }
    
    // Method getInfo() that returns:
    // "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
    public String getInfo() {
        return "ID: " + studentId + " | Name: " + name + " | Enrolled: " + enrollmentYear;
    }
}
