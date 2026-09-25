// Course class - demonstrates both aggregation (Professor) and composition (Lectures)
class Course {
    private String title;
    private Professor professor;
    private Lecture[] lectures;
    
    public Course(String title, Professor professor, int numberOfLectures) {
        this.title = title;
        this.professor = professor;
        this.lectures = new Lecture[numberOfLectures];
        for (int i = 0; i < numberOfLectures; i++) {
            lectures[i] = new Lecture("Topic " + (i + 1), 45);
        }
    }
    
    public String getInfo() {
        return "Course: " + title + "\n" +
               "Instructor: " + professor.toString() + "\n" +
               "Lectures: " + lectures.length;
    }
    
    public String listLectures() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lectures.length; i++) {
            sb.append(lectures[i].toString());
            if (i < lectures.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}