package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Disco> aDiscos = new ArrayList<Disco>();
        aDiscos.add(new Disco("nombreAAAAAAAA", "grupoPrimero"));
        aDiscos.add(new Disco("nombreBB", "grupoSegundooooooooooooooooooooo"));

        // ------------------------------
        // ORDENAR POR LONGITUD DEL NOMBRE
        // ------------------------------
        Collections.sort(aDiscos);
        System.out.println("Ordenados por longitud del nombre:");
        for (Disco d : aDiscos) {
            System.out.println(d);
        }

        // ------------------------------
        // ORDENAR POR LONGITUD DEL GRUPO
        // ------------------------------
        Collections.sort(aDiscos, new Comparator<Disco>() {
            @Override
            public int compare(Disco d1, Disco d2) {
                return d1.getGrupo().length() - d2.getGrupo().length();
            }
        });

        System.out.println("\nOrdenados por longitud del grupo:");
        for (Disco d : aDiscos) {
            System.out.println(d);
        }
    }
}
