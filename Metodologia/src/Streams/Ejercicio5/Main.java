package Streams.Ejercicio5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Filter -> Map");
        numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("Map -> Filter");
        numbers.stream()
                .map(n -> n * 2)
                .filter(n -> n > 5)
                .forEach(System.out::println);

    }
}
