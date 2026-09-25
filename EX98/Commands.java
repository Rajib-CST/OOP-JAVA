// Concrete Command classes that encapsulate device operations

class TVOnCommand implements Command {
    private Television television;
    
    public TVOnCommand(Television television) {
        this.television = television;
    }
    
    public void execute() {
        television.powerOn();
    }
}

class TVOffCommand implements Command {
    private Television television;
    
    public TVOffCommand(Television television) {
        this.television = television;
    }
    
    public void execute() {
        television.powerOff();
    }
}

class TVChannelCommand implements Command {
    private Television television;
    private int channel;
    
    public TVChannelCommand(Television television, int channel) {
        this.television = television;
        this.channel = channel;
    }
    
    public void execute() {
        television.setChannel(channel);
    }
}

class ThermostatSetCommand implements Command {
    private Thermostat thermostat;
    private int temperature;
    
    public ThermostatSetCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }
    
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}
