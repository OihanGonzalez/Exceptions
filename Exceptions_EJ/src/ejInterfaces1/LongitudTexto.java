package ejInterfaces1;

import java.util.function.Function;

public class LongitudTexto implements Function<String, Integer> {

	@Override
	public Integer apply(String texto) {
		return texto.length();
	}
}
