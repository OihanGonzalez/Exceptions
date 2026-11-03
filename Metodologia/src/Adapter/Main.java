package Adapter;
public class Main {
	public static void main(String[] args) {
		FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(180);
		TemperatureProvider temperatureProvider = new SensorAdapter(fahrenheitSensor);

		System.out.println(String.format("%.1f", temperatureProvider.getTemperatureCelsius()));
	}
}
