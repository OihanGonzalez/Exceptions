package ejInterfaces2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GestorPedidos {

    public List<Pedido> buscar(List<Pedido> pedidos, Predicate<Pedido> condicion) {
        List<Pedido> resultado = new ArrayList<>();

        for (Pedido p : pedidos) {
            if (condicion.test(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<String> transformar(List<Pedido> pedidos, Function<Pedido, String> transformacion) {
        List<String> resultado = new ArrayList<>();

        for (Pedido p : pedidos) {
            resultado.add(transformacion.apply(p));
        }
        return resultado;
    }

    public void procesar(List<Pedido> pedidos, Consumer<Pedido> accion) {
        for (Pedido p : pedidos) {
            accion.accept(p);
        }
    }
}
