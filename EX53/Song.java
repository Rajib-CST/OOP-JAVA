// Song class that extends Media
class Song extends Media {
    private String artist;
    
    public Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }
    
    @Override
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
    
    public void showArtist() {
        System.out.println("Artist: " + artist);
    }
}
