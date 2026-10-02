package ejInterfaces1;

import java.util.function.Consumer;

public class MostrarTexto implements Consumer<String> {

   @Override
   public void accept(String texto) {
       System.out.println(texto);
   }
}
