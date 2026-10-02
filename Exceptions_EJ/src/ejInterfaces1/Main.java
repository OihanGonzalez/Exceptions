package ejInterfaces1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Predicate<Integer> p = new EsMayorDeEdad();

		System.out.println(p.test(5));

		Function<String, Integer> lt = new LongitudTexto();

		System.out.println(lt.apply("Texto de ejemplo"));
		
		Consumer<String> c = new MostrarTexto();

		c.accept("Esto es un texto");
	}
}
