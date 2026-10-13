package MethodReference.MethodReferenceEj5;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> longitudMR = String::length;
		System.out.println(longitudMR.apply("Cadena de Method Reference"));

		Function<String, Integer> longitudLambda = s -> s.length();
		System.out.println(longitudLambda.apply("Cadena de Lambda"));
	}
}
