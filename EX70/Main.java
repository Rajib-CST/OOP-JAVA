import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read first student's data
        String id1 = scanner.nextLine();
        String name1 = scanner.nextLine();
        double gpa1 = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        // Read second student's data
        String id2 = scanner.nextLine();
        String name2 = scanner.nextLine();
        double gpa2 = scanner.nextDouble();
        
        // TODO: Create two Student objects using the input data
        Student student1 = new Student(id1, name1, gpa1);
        Student student2 = new Student(id2, name2, gpa2);

        // TODO: Print "Same reference: " followed by whether student1 equals itself
        System.out.println("Same reference: " + (student1 == student1));

        // TODO: Print "Content equality: " followed by whether student1 equals student2
        System.out.println("Content equality: " + student1.equals(student2));

        // TODO: Print "Hash codes match: " followed by whether both students have the same hash code
        System.out.println("Hash codes match: " + (student1.hashCode() == student2.hashCode()));
    }
}
