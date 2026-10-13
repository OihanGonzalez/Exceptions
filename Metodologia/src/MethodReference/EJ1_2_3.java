package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;

public class EJ1_2_3 {
    public static void main(String[] args) {
        // EJERCICIO 1
        Function<String, Integer> convertir = Integer::parseInt;

        Function<String, Integer> convertir2 = i -> Integer.parseInt(i);

        String s = "1";
        System.out.println(convertir.apply(s));
        System.out.println(convertir2.apply(s));

        // EJERCICIO 2

        Function<String, String> mayusculas = texto -> texto.toUpperCase();

        Function<String, String> mayusculas2 = String::toUpperCase;

        String s2 = "ejercicio dos";
        System.out.println(mayusculas.apply(s2));       
        System.out.println(mayusculas2.apply(s2));

        // Ejercicio 3

        Consumer<String> imprimir = System.out::println;

        Consumer<String> imprimir2 = str -> System.out.println(str);

        String s3 = "Ejercicio III";
        imprimir.accept(s3);
        imprimir2.accept(s3);
    }
}
