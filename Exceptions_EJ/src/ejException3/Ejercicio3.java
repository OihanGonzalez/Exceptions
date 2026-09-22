package ejException3;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Ejercicio3 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		String operador = "";
		float resultado = 0;
		boolean ok = false;

		System.out.println("Dame un número: ");
		while(!ok) {
			try {
				numero1 = sc.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor válido.");
				sc.next();
			}
		}
		ok = false;

		System.out.println("Dame otro número: ");
		while(!ok) {
			try {
				numero2 = sc.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor válido.");
				sc.next();
			}
		}
		ok = false;

		System.out.println("¿Qué tipo de ecuación quieres hacer? (+, -, *, /)");
		while(!ok) {
			try {
				operador = sc.next();
				if (!operador.matches("[+\\-*/]")) {
					throw new IllegalArgumentException("Operador no válido, introduce uno válido (+, -, *, /)");
				}
				ok = true;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		switch (operador) {
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "*":
				resultado = numero1 * numero2;
				break;
			case "/":
				try {
					resultado = numero1 / numero2;
				} catch (ArithmeticException e) {
					System.out.println("La ecuación no es válida, el divisor no puede ser 0");
					ok = false;
				}
				break;
		}

		if (ok) {
			System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
		}

		sc.close();
	}
}
