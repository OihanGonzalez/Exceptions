package Observer.ObserverEj1;

public class Alarma implements Observador{

	@Override
	public void actualizar(int temperatura) {
		if (temperatura > 30) {
			System.out.println("Temperatura superior a 30ºC");
		}
	}
}
