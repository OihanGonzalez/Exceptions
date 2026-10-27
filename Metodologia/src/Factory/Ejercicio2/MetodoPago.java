package Factory.Ejercicio2;

public class MetodoPago {

    public static Pago crearMetodoPago(String tipo) {

        if (tipo.equals("tarjeta")) {
            return new Tarjeta();
        }

        if (tipo.equals("paypal")) {
            return new Paypal();
        }

        return null;
    }

}