package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        ManejadorExcepciones manejador = new ManejadorExcepciones();

        try {
            controlador.controlador();
        } catch (RuntimeException e) {
            manejador.manejarExcepcion(e);
        }

        System.out.println("Aplicación terminada");
    }
}
