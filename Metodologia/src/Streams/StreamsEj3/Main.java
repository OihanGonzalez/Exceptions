package Streams.StreamsEj3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> nombres =
			Arrays.asList(
					"Ana",
					"Luis",
					"Pedro");

		nombres.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
