package ejInterfaces4;

public class Main {

    public static void main(String[] args) {
        // Transformador Longitud 
        Transformador<String, Integer> longitud = new Transformador<String, Integer>() {
            @Override
            public Integer transformar(String dato) {
                return dato.length();
            }
        };
        // Transformador Longitud version corta
        Transformador<String, Integer> longitud2 = dato -> dato.length();

        // Transformador Reverse string
        Transformador<String, String> reverso = new Transformador<String, String>() {
            @Override
            public String transformar(String dato) {
                char[] cArray = dato.toCharArray();
                for (int i = 0; i < cArray.length / 2; i++) {
                    char t = cArray[i]; // Cojer caracter en i 
                    cArray[i] = cArray[cArray.length - 1 - i]; // Cambiar caracter en i por caracter en el "i inverso"
                    cArray[cArray.length - 1 - i] = t; // Caombiar caracter en el "i inverso" por el del i actual que guardamos antes (t)
                }
                return new String(cArray);
            }
        };


        String dato = "Celica GT-FOUR";

        System.out.println(longitud.transformar(dato));
        System.out.println(longitud2.transformar(dato));
        System.out.println(reverso.transformar(dato));

    }

}
