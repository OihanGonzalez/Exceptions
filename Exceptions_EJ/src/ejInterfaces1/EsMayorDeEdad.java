package ejInterfaces1;

import java.util.function.Predicate;

public class EsMayorDeEdad implements Predicate<Integer> {

	@Override
	public boolean test(Integer edad) {
		return edad >= 18;
	}
}
