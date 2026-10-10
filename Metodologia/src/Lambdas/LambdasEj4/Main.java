package Lambdas.LambdasEj4;

public class Main {
	 public static void main(String[] args) {

		Operacion operacionSuma =  (x, y) -> x + y;
		Operacion operacionMultiplicacion =  (x, y) -> x * y;

        int suma = operar(5, 3, operacionSuma);
        int multiplicacion = operar(5, 3, operacionMultiplicacion);

        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
    }

	static int operar(int a, int b, Operacion operacion) {
    return operacion.calcular(a, b);
}
}
