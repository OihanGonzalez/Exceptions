package ejInterfaces1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override 
			public boolean test(Integer edad) {
				return edad >= 18;
			}
		};

		System.out.println(p.test(25));

		Function<String, Integer> lt = new Function<String, Integer>() {

			@Override
			public Integer apply(String texto) {
				return texto.length();
			}
		};

		System.out.println(lt.apply("Texto de ejemplo"));
		
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String texto) {
				System.out.println(texto);
			}
		};

		c.accept("Esto es un texto");
	}
}
