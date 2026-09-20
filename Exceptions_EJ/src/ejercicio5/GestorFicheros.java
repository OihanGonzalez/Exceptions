package ejercicio5;

import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

    public void comprobarFichero() {

        try (FileReader lector = new FileReader("cuentas.txt")) {
            lector.read();
            System.out.println("Fichero abierto correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo abrir el fichero: " + e.getMessage());
        }
        
    }
}