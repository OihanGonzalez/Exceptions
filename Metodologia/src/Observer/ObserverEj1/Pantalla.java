package Observer.ObserverEj1;

public class Pantalla implements Observador{

	@Override
	public void actualizar(int temperatura) {
		System.out.println("Temperatura actual: " + temperatura + "ºC");
	}
}
