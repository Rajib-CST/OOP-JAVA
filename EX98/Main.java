import java.util.Scanner;

class RemoteControl {
    private Command command;
    
    public void setCommand(Command cmd) {
        this.command = cmd;
    }
    
    public void pressButton() {
        command.execute();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int channel = scanner.nextInt();
        int temperature = scanner.nextInt();
        
        // Create a Television and a Thermostat
        Television tv = new Television();
        Thermostat thermostat = new Thermostat();
        
        // Create a RemoteControl
        RemoteControl remote = new RemoteControl();
        
        // Demonstrate the Command Pattern:
        // 1. Set a TVOnCommand and press the button
        remote.setCommand(new TVOnCommand(tv));
        remote.pressButton();
        
        // 2. Set a TVChannelCommand with the input channel and press the button
        remote.setCommand(new TVChannelCommand(tv, channel));
        remote.pressButton();
        
        // 3. Set a ThermostatSetCommand with the input temperature and press the button
        remote.setCommand(new ThermostatSetCommand(thermostat, temperature));
        remote.pressButton();
        
        // 4. Set a TVOffCommand and press the button
        remote.setCommand(new TVOffCommand(tv));
        remote.pressButton();
        
        scanner.close();
    }
}
