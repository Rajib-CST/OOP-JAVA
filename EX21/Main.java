import java.util.Scanner;

class ExamScore {
    private String studentName;
    private int score;
    private boolean passing;
    public ExamScore(String studentName, int score) { this.studentName = studentName; setScore(score); }
    public String getStudentName() { return this.studentName; }
    public int getScore() { return this.score; }
    public void setScore(int score) {
        if (score >= 0 && score <= 100) { this.score = score; this.passing = score >= 60; }
    }
    public boolean isPassing() { return this.passing; }
    public char getGrade() {
        if (this.score >= 90) return 'A';
        if (this.score >= 80) return 'B';
        if (this.score >= 70) return 'C';
        if (this.score >= 60) return 'D';
        return 'F';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int score1 = Integer.parseInt(sc.nextLine());
        int score2 = Integer.parseInt(sc.nextLine());
        ExamScore exam = new ExamScore(name, score1);
        System.out.println(exam.getStudentName() + ": " + exam.getScore() + " (" + exam.getGrade() + ")");
        System.out.println("Passing: " + exam.isPassing());
        exam.setScore(score2);
        System.out.println(exam.getStudentName() + ": " + exam.getScore() + " (" + exam.getGrade() + ")");
        System.out.println("Passing: " + exam.isPassing());
    }
}
