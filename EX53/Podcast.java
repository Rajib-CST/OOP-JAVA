// Podcast class that extends Media
class Podcast extends Media {
    private int episode;
    
    public Podcast(String title, int episode) {
        super(title);
        this.episode = episode;
    }
    
    @Override
    public void play() {
        System.out.println("Playing podcast: " + title + " - Episode " + episode);
    }
    
    public void showEpisode() {
        System.out.println("Episode: " + episode);
    }
}
