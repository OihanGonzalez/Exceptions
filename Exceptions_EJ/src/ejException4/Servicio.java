package ejException4;

public class Servicio {

    private Negocio negocio;

    public Servicio() {
        negocio = new Negocio();
    }

    public void servicio() {

        System.out.println("Servicio: voy a realizar el cálculo");

        negocio.calcular();

        System.out.println("Servicio: cálculo terminado");
    }
}
