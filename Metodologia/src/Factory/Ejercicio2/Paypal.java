package Factory.Ejercicio2;

public class Paypal implements Pago {
    @Override
    public void realizarPago() {
        System.out.println("Pagando con paypal");
    }
}
