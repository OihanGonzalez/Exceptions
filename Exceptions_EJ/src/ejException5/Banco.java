package ejException5;

public class Banco {

    public void transferir(Cuenta origen, Cuenta destino, double cantidad) throws TransferenciaException {

        if (origen == null || destino == null) {
            throw new IllegalArgumentException("Las cuentas no pueden ser null");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        if (origen.getSaldo() < cantidad) {
            throw new TransferenciaException("No hay saldo suficiente para realizar la transferencia");
        }

        origen.retirar(cantidad);
        destino.ingresar(cantidad);
    }
}
