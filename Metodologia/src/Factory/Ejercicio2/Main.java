package Factory.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Pago pago1 = MetodoPago.crearMetodoPago("tarjeta");
        pago1.realizarPago();

        Pago pago2 = MetodoPago.crearMetodoPago("paypal");
        pago2.realizarPago();
    }

}
