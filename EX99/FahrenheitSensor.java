class FahrenheitSensor {
    private double temperature;
    
    public FahrenheitSensor(double temperature) {
        this.temperature = temperature;
    }
    
    public double readFahrenheit() {
        return temperature;
    }
}
