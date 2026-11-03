package Adapter;

public class SensorAdapter implements TemperatureProvider{
	private FahrenheitSensor fahrenheitSensor;

	public SensorAdapter(FahrenheitSensor fahrenheitSensor) {
		this.fahrenheitSensor = fahrenheitSensor;
	}

	@Override
	public float getTemperatureCelsius() {
		return (fahrenheitSensor.getTemperaturaFahrenheit()-32)*5/9;
	}

}
