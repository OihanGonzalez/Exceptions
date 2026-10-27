package Observer.ObserverEj1;

import java.util.ArrayList;

public class Termometro {
	private ArrayList<Observador> observadores = new ArrayList<>();

	public void suscribir(Observador observador) {
		observadores.add(observador);
	}

	public void anadir(int temperatura) {
		for (Observador observador : observadores) {
			observador.actualizar(temperatura);
		}
	}
}
