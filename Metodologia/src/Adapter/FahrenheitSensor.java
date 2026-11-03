package Adapter;

public class FahrenheitSensor {
	private float temperaturaFahrenheit;

	public FahrenheitSensor(float temperaturaFahrenheit) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
	}

	public float getTemperaturaFahrenheit() {
		return temperaturaFahrenheit;
	}

	public void setTemperaturaFahrenheit(float temperaturaFahrenheit) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
	}

	public float readFahrenheit() {
		return this.temperaturaFahrenheit;
	}
}
