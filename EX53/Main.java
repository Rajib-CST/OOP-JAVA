import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String songTitle = scanner.nextLine();
        String artistName = scanner.nextLine();
        String podcastTitle = scanner.nextLine();
        int episodeNumber = scanner.nextInt();
        
        // Create a Song and upcast it to a Media reference
        Media songMedia = new Song(songTitle, artistName);
        
        // Call play() on the Media reference (demonstrates polymorphism)
        songMedia.play();
        
        // Downcast the Media reference back to Song
        Song song = (Song) songMedia;
        
        // Call showArtist() on the Song reference
        song.showArtist();
        
        // Create a Podcast and upcast it to a Media reference
        Media podcastMedia = new Podcast(podcastTitle, episodeNumber);
        
        // Call play() on the Media reference
        podcastMedia.play();
        
        // Downcast the Media reference back to Podcast
        Podcast podcast = (Podcast) podcastMedia;
        
        // Call showEpisode() on the Podcast reference
        podcast.showEpisode();
    }
}
