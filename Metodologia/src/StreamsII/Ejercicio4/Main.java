import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("Leche", 1.20);
        Producto p2 = new Producto("Pan", 0.90);
        Producto p3 = new Producto("Huevos", 2.50);
        Producto p4 = new Producto("Arroz", 1.80);
        Producto p5 = new Producto("Leche", 1.20);
        Producto p6 = new Producto("Café", 3.50);

        Cliente c1 = new Cliente("Ana",
                Arrays.asList(p1, p2));

        Cliente c2 = new Cliente("Luis",
                Arrays.asList(p3, p4, p5));

        Cliente c3 = new Cliente("Marta",
                Arrays.asList(p6));

        List<Cliente> clientes = Arrays.asList(c1, c2, c3);

        // Obtener todos los productos
        List<Producto> todosLosProductos = clientes.stream()
                .flatMap(cliente -> cliente.getProductos().stream())
                .toList();

        // Mostrar nombre de cada producto
        System.out.println("Todos los productos:");
        todosLosProductos.stream()
                .map(Producto::getNombre)
                .forEach(System.out::println);

        // Mostrar productos con precio superior a 2 €
        System.out.println("\nProductos con precio superior a 2 €:");
        todosLosProductos.stream()
                .filter(producto -> producto.getPrecio() > 2)
                .forEach(System.out::println);

        // Calcular importe total
        double total = todosLosProductos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println("\nImporte total: " + total + " €");
    }
}