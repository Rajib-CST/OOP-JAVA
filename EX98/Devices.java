// Receiver classes - the actual devices that perform actions

class Television {
    public void powerOn() {
        System.out.println("TV is now ON");
    }
    
    public void powerOff() {
        System.out.println("TV is now OFF");
    }
    
    public void setChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }
}

class Thermostat {
    public void setTemperature(int temp) {
        System.out.println("Thermostat set to " + temp + " degrees");
    }
    
    public void turnOff() {
        System.out.println("Thermostat turned OFF");
    }
}
