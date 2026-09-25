public class Playlist {
    private String[] songs;
    private int count = 0;
    
    public Playlist(int capacity) {
        songs = new String[capacity];
    }
    
    public void addSong(String song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }
    
    public Iterator<String> createIterator() {
        return new PlaylistIterator();
    }
    
    private class PlaylistIterator implements Iterator<String> {
        private int index = 0;
        
        public boolean hasNext() {
            return index < count;
        }
        
        public String next() {
            return songs[index++];
        }
    }
}
