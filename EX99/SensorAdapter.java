class SensorAdapter implements TemperatureProvider {
    private FahrenheitSensor sensor;
    
    public SensorAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }
    
    public double getTemperatureCelsius() {
        double fahrenheit = sensor.readFahrenheit();
        return (fahrenheit - 32) * 5 / 9;
    }
}
