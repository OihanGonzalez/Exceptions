package Lambdas.LambdasEj3;

public class Main {
    public static void main(String[] args) {
        Operacion<Integer, Integer> suma = (a, b) -> a + b;
        Operacion<Integer, Integer> resta = (a, b) -> a - b;
        Operacion<Integer, Integer> multiplicacion = (a, b) -> a * b;

        System.out.println(suma.calcular(10, 4));
        System.out.println(resta.calcular(10, 4));
        System.out.println(multiplicacion.calcular(10, 4));

    }
}
