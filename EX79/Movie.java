record Movie(String title, String genre, int durationMinutes) {
    
    public String getFormattedDuration() {
        int hours = durationMinutes / 60;
        int minutes = durationMinutes % 60;
        return hours + "h " + minutes + "m";
    }
    
}
