import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String deviceName = scanner.nextLine();
        String assistantName = scanner.nextLine();
        String songName = scanner.nextLine();
        
        SmartSpeaker speaker = new SmartSpeaker(deviceName, assistantName);
        
        speaker.setSong(songName);
        
        speaker.getFullInfo();
        
        speaker.playSound();
        
        speaker.voiceCommand("skip to next");
    }
}
