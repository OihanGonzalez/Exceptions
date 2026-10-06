package Lambdas.LambdasEj5;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
        Predicate<Integer> masQueCien = (num) ->  num > 100;
        System.out.println(masQueCien.test(2));
        System.out.println(masQueCien.test(102));
        System.out.println(masQueCien.test(100));

    }
}
