package ej_anonima3;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1001, 250.50);

        procesarPedido(pedido, new AccionPedido() {

            @Override
            public void ejecutar(Pedido pedido) {
                System.out.println("Número: " + pedido.getNumero());
                System.out.println("Importe: " + pedido.getImporte() + " EUR");
            }
        });

        procesarPedido(pedido, new AccionPedido() {

            @Override
            public void ejecutar(Pedido pedido) {
                System.out.println("From empresa@pedidos.com To: cliente@españa.es");
                System.out.println("Sujeto: Importe de pedido " + pedido.getNumero());
                System.out.println("Número: " + pedido.getNumero());
                System.out.println("Importe: " + pedido.getImporte() + " EUR");
            }
        });
        procesarPedido(pedido, new AccionPedido() {

            @Override
            public void ejecutar(Pedido pedido) {
                System.out.println("Factura " + pedido.getNumero());
                System.out.println("Numero de factura: " + pedido.getNumero());
                System.out.println("Importe Base: " + pedido.getImporte() + " EUR");
                System.out.println("IVA: " + (pedido.getImporte()*0.21) + " EUR");
                System.out.println("Total: " + (pedido.getImporte()+(pedido.getImporte()*0.21)) + " EUR");

            }
        });

        procesarPedido(pedido, new AccionPedido() {

            @Override
            public void ejecutar(Pedido pedido) {
                System.out.println("Guardando archivo " + pedido.getNumero() + ".log");
                System.out.println("Archivo " + pedido.getNumero() + ".log ha sido guardado correctametne.");

            }
        });

    }

    private static void procesarPedido(Pedido pedido, AccionPedido accionPedido) {
        accionPedido.ejecutar(pedido);

    }

}
