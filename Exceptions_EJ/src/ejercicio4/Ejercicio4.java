package ejercicio4;

import java.util.Scanner;
 
public class Ejercicio4 {
 
    public static void main(String[] args) {
 
        try {
 
            controlador();
 
        } catch (RuntimeException e) {
 
            manejarExcepcion(e);
        }
 
        System.out.println("Aplicación terminada");
    }
 
    // Simula un controlador (capa del controlador)
    public static void controlador() {
 
        System.out.println("Controlador: recibo la petición");
 
        servicio();
 
        System.out.println("Controlador: petición procesada");
    }
 
    // Simula la capa de servicio
    public static void servicio() {
 
        System.out.println("Servicio: voy a realizar el cálculo");
 
        calcular();
 
        System.out.println("Servicio: cálculo terminado");
    }
 
    // Simula una operación de negocio (capa de negocio)
    public static void calcular() {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(sc.nextLine());
 
        int resultado = 100 / numero;
 
        System.out.println("Resultado: " + resultado);
    }
 
    // Simula el manejador global de Spring
    public static void manejarExcepcion(RuntimeException e) {
 
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
