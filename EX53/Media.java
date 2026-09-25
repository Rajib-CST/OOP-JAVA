// Base class for all media types
class Media {
    protected String title;
    
    public Media(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void play() {
        System.out.println("Playing: " + title);
    }
}
