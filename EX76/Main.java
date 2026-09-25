import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String professorName = scanner.nextLine();
        String department = scanner.nextLine();
        String courseTitle = scanner.nextLine();
        int numberOfLectures = scanner.nextInt();
        
        // Create a Professor object (exists independently - aggregation)
        Professor professor = new Professor(professorName, department);
        
        // Create a Course object, passing the professor (aggregation)
        // The course will create its own lectures internally (composition)
        Course course = new Course(courseTitle, professor, numberOfLectures);
        
        // Print getInfo() result
        System.out.println(course.getInfo());
        
        // Print an empty line
        System.out.println();
        
        // Print listLectures() result
        System.out.println(course.listLectures());
    }
}