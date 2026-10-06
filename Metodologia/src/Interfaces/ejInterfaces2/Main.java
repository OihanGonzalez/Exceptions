package ejInterfaces2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Ana", 1200, true));
        pedidos.add(new Pedido(2, "Carlos", 350, false));
        pedidos.add(new Pedido(3, "Marta", 800, true));
        pedidos.add(new Pedido(4, "Luis", 1500, false));

        GestorPedidos gestor = new GestorPedidos();

        // 1. BUSCAR

        System.out.println("Pedidos con importe superior a 1000€:");
        List<Pedido> caros = gestor.buscar(pedidos, new Predicate<Pedido>() {
            @Override
            public boolean test(Pedido p) {
                return p.getImporte() > 1000;
            }
        });

        for (Pedido p : caros) {
            System.out.println(p.getNumero() + " - " + p.getCliente());
        }

        System.out.println("\nPedidos sin pagar:");
        List<Pedido> noPagados = gestor.buscar(pedidos, new Predicate<Pedido>() {
            @Override
            public boolean test(Pedido p) {
                return !p.isPagado();
            }
        });

        for (Pedido p : noPagados) {
            System.out.println(p.getNumero() + " - " + p.getCliente());
        }

        // 2. TRANSFORMAR

        System.out.println("\nTransformación CSV:");
        List<String> csv = gestor.transformar(pedidos, new Function<Pedido, String>() {
            @Override
            public String apply(Pedido p) {
                return p.getNumero() + ";" + p.getCliente() + ";" + p.getImporte() + ";" + p.isPagado();
            }
        });

        for (String linea : csv) {
            System.out.println(linea);
        }

        System.out.println("\nTransformación descripción:");
        List<String> descripcion = gestor.transformar(pedidos, new Function<Pedido, String>() {
            @Override
            public String apply(Pedido p) {
                return "Pedido " + p.getNumero() + " - Cliente: " + p.getCliente() +
                        " - Importe: " + p.getImporte() + " €";
            }
        });

        for (String linea : descripcion) {
            System.out.println(linea);
        }

        // 3. PROCESAR

        System.out.println("\nMostrar número y cliente:");
        gestor.procesar(pedidos, new Consumer<Pedido>() {
            @Override
            public void accept(Pedido p) {
                System.out.println(p.getNumero() + " - " + p.getCliente());
            }
        });

        System.out.println("\nAviso para pedidos no pagados:");
        gestor.procesar(pedidos, new Consumer<Pedido>() {
            @Override
            public void accept(Pedido p) {
                if (!p.isPagado()) {
                    System.out.println("AVISO: El pedido " + p.getNumero() + " no está pagado.");
                }
            }
        });
    }

}
