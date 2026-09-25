import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int enrollmentYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String newName = scanner.nextLine();
        
        // Create a Student object with the initial values
        Student student = new Student(studentId, name, enrollmentYear);
        
        // Print the student info before the name change
        System.out.println(student.getInfo());
        
        // Update the student's name using the setter
        student.setName(newName);
        
        // Print the student info after the name change
        System.out.println(student.getInfo());
    }
}
