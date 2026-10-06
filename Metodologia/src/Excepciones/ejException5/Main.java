package ejException5;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Ana", 1000);
        Cuenta cuenta2 = new Cuenta("Luis", 500);

        Banco banco = new Banco();

        try {
            banco.transferir(cuenta1, cuenta2, 300);
            System.out.println("Transferencia realizada correctamente");
        } catch (TransferenciaException e) {
            System.out.println("Error en la transferencia: " + e.getMessage());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error en los datos: " + e.getMessage());
        }

        System.out.println("Saldo Ana: " + cuenta1.getSaldo());
        System.out.println("Saldo Luis: " + cuenta2.getSaldo());

        GestorFicheros gestor = new GestorFicheros();
        gestor.comprobarFichero();
    }
}
