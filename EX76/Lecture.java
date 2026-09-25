// Lecture class - only makes sense within a course (used in composition)
class Lecture {
    private String topic;
    private int durationMinutes;
    
    public Lecture(String topic, int durationMinutes) {
        this.topic = topic;
        this.durationMinutes = durationMinutes;
    }
    
    public String getTopic() {
        return topic;
    }
    
    public int getDurationMinutes() {
        return durationMinutes;
    }
    
    @Override
    public String toString() {
        return "Lecture: " + topic + " (" + durationMinutes + " min)";
    }
}