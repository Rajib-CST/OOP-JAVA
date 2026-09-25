// MusicPlayer extends AudioDevice - single inheritance
public class MusicPlayer extends AudioDevice {
    private String currentSong;
    
    public MusicPlayer(String deviceName) {
        super(deviceName);
    }
    
    public void setSong(String song) {
        this.currentSong = song;
    }
    
    @Override
    public void playSound() {
        System.out.println(getDeviceName() + ": Now playing - " + currentSong);
    }
}
