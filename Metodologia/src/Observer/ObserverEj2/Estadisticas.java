package Observer.ObserverEj2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Estadisticas implements Observador{

	@Override
	public void actualizar(int puntos) {
		Path ruta = Path.of("estadisticas.dat");

		try {
			Files.writeString(ruta, String.valueOf(puntos));
			System.out.println("Fichero escrito correctamente.");
		} catch (IOException e) {
			System.err.println("Error al escribir el fichero: " + e.getMessage());
		}
	}
}
