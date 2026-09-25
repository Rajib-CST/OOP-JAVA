import java.util.Scanner;

class Student {
    private String name;
    private int score;
    public Student(String name, int score) { this.name = name; this.score = score; }
    public String getName() { return this.name; }
    public int getScore() { return this.score; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        int score1 = Integer.parseInt(sc.nextLine());
        String name2 = sc.nextLine();
        int score2 = Integer.parseInt(sc.nextLine());
        Student student1 = new Student(name1, score1);
        Student student2 = new Student(name2, score2);

        int average = (student1.getScore() + student2.getScore()) / 2;
        String topName = (student1.getScore() > student2.getScore()) ? student1.getName() : student2.getName();

        System.out.println(student1.getName() + ": " + student1.getScore());
        System.out.println(student2.getName() + ": " + student2.getScore());
        System.out.println("Average: " + average);
        System.out.println("Top scorer: " + topName);
    }
}
