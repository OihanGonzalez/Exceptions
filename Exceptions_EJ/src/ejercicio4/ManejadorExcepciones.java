package ejercicio4;

public class ManejadorExcepciones {

    public void manejarExcepcion(RuntimeException e) {

        System.out.println();
        System.out.println("===== MANEJADOR GLOBAL =====");

        if (e instanceof NumberFormatException) {
            System.out.println("Error: debes introducir un número.");

        } else if (e instanceof ArithmeticException) {
            System.out.println("Error: no se puede dividir entre cero.");

        } else {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
