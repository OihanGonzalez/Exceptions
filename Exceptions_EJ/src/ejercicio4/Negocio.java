package ejercicio4;

import java.util.Scanner;

public class Negocio {

    public void calcular() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int numero = Integer.parseInt(sc.nextLine());

        int resultado = 100 / numero;

        System.out.println("Resultado: " + resultado);
    }
}
