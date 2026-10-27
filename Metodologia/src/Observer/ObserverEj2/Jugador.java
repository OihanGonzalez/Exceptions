package Observer.ObserverEj2;

import java.util.ArrayList;

public class Jugador {
	private ArrayList<Observador> observadores = new ArrayList<>();
	private int puntosTotales = 0;

	public void suscribir(Observador observador) {
		observadores.add(observador);
	}

	public void sumarPuntos(int puntos) {
		puntosTotales += puntos;
		for (Observador observador : observadores) {
			observador.actualizar(puntosTotales);
		}
	}
}
