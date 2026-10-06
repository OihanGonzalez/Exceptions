package Lambdas.LambdasEj2;

public class Main {

	public static void main(String[] args) {
		OperacionSuma op = (a,b,c) -> a+b+c;

		System.out.println(op.calcular(1, 10, 3));
	}
}
