package Lambdas.LambdasEj6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Lucia");
        nombres.add("Juan");

        Predicate<String> masDe4 = nombre -> nombre.length() > 4;
        Consumer<String> mostrarMayus = nombre -> System.out.println(nombre.toUpperCase());

        for (String nombre : nombres) {
            if (masDe4.test(nombre)) {
                mostrarMayus.accept(nombre);
            }
        }
    }
}