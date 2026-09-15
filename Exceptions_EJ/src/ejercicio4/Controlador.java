package ejercicio4;

public class Controlador {

    private Servicio servicio;

    public Controlador() {
        servicio = new Servicio();
    }

    public void controlador() {

        System.out.println("Controlador: recibo la petición");

        servicio.servicio();

        System.out.println("Controlador: petición procesada");
    }
}
