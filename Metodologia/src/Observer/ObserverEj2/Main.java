package Observer.ObserverEj2;

public class Main {
	public static void main(String[] args) {
		Jugador jugador = new Jugador();

		Marcador estadisticas = new Marcador();
		Estadisticas marcador = new Estadisticas();

		jugador.suscribir(estadisticas);
		jugador.suscribir(marcador);

		jugador.sumarPuntos(10);
		jugador.sumarPuntos(10);
		jugador.sumarPuntos(10);
	}
}

