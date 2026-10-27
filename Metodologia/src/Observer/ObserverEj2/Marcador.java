package Observer.ObserverEj2;

public class Marcador implements Observador{

	@Override
	public void actualizar(int puntos) {
		System.out.println("Puntos: " + puntos);
	}
}
