package Streams.StreamsEj4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> nombres =
			Arrays.asList(
					"Ana",
					"Luis",
					"Jesus",
					"Macarena",
					"Pedro",
					"Jose Luis");

		nombres.stream().filter(n -> n.length() > 4).forEach(System.out::println);
	}
}
