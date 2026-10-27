package Observer.ObserverEj1;

public class Main {
	public static void main(String[] args) {
		Termometro termometro = new Termometro();

		Pantalla pantalla = new Pantalla();
		Alarma alarma = new Alarma();

		termometro.suscribir(pantalla);
		termometro.suscribir(alarma);

		termometro.anadir(10);
		System.out.println("-------------------");
		termometro.anadir(50);
	}
}

