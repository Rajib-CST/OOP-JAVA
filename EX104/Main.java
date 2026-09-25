import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Playlist playlist = new Playlist(10);
        
        String[] songTitles = input.split(",");
        for (String title : songTitles) {
            playlist.addSong(title);
        }
        
        Iterator<String> iterator = playlist.createIterator();
        
        while (iterator.hasNext()) {
            Song song = new Song(iterator.next());
            System.out.println(song);
        }
        
        System.out.println("Playlist complete!");
    }
}
