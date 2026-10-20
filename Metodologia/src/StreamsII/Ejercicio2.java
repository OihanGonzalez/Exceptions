package StreamsII;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("2");
        test1.add("1");
        test1.add("3");
        ArrayList<Integer> test2 = test1.stream()
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toCollection(ArrayList::new));

    }
}
