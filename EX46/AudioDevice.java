// Base class for all audio-playing devices
public class AudioDevice {
    private String deviceName;
    
    public AudioDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public String getDeviceName() {
        return deviceName;
    }
    
    public void playSound() {
        System.out.println(deviceName + ": Playing audio");
    }
}
