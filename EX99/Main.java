import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        
        FahrenheitSensor sensor = new FahrenheitSensor(fahrenheit);
        
        SensorAdapter adapter = new SensorAdapter(sensor);
        
        TemperatureProvider provider = adapter;
        
        double celsius = provider.getTemperatureCelsius();
        System.out.println("Temperature: " + String.format("%.1f", celsius) + " C");
    }
}
