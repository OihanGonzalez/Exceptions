package MethodReference.MethodReferenceEj4;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		Operacion suma = (a, b) -> calculadora.sumar(a, b);
		System.out.println(suma.calcular(1, 2));

		Operacion sumaMR = calculadora::sumar;
		System.out.println(sumaMR.calcular(2, 6));
	}
}
