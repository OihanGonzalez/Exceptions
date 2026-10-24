package StreamsII.Ejercicio5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.io.BufferedWriter;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        fillData();

        List<Reserva> reservas;

        try (Stream<String> lineas = Files.lines(Path.of("reservas.txt"))) {

            reservas = lineas
                    .map(linea -> linea.split(";"))
                    .map(datos -> new Reserva(
                            Integer.parseInt(datos[0]),
                            datos[1],
                            datos[2],
                            datos[3],
                            Integer.parseInt(datos[4]),
                            Double.parseDouble(datos[5]),
                            datos[6]))
                    .toList();

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
            return;
        }

        // 1. Reservas con importe superior a 300 €

        System.out.println("RESERVAS SUPERIORES A 300 €");

        reservas.stream()
                .filter(r -> r.getImporte() > 300)
                .forEach(System.out::println);

        // 2. Clientes de Bilbao

        List<String> clientesBilbao = reservas.stream()
                .filter(r -> r.getCiudadOrigen().equals("Bilbao"))
                .map(Reserva::getCliente)
                .toList();

        System.out.println("\nCLIENTES DE BILBAO");
        clientesBilbao.forEach(System.out::println);

        // 3. Clientes con al menos 3 noches

        List<String> clientesTresNoches = reservas.stream()
                .filter(r -> r.getNoches() >= 3)
                .map(Reserva::getCliente)
                .sorted()
                .toList();

        System.out.println("\nCLIENTES CON 3 O MAS NOCHES");

        clientesTresNoches.forEach(System.out::println);

        // 4. Facturación total

        double facturacionTotal = reservas.stream()
                .mapToDouble(Reserva::getImporte)
                .sum();

        System.out.println("\nFACTURACION TOTAL");
        System.out.println(facturacionTotal);

        // 5. Importe medio

        double importeMedio = reservas.stream()
                .mapToDouble(Reserva::getImporte)
                .average()
                .orElse(0);

        System.out.println("\nIMPORTE MEDIO");
        System.out.println(importeMedio);

        // 6. Número de reservas por habitación

        Map<String, Long> reservasPorHabitacion = reservas.stream()
                .collect(
                        Collectors.groupingBy(
                                Reserva::getTipoHabitacion,
                                Collectors.counting()));

        System.out.println("\nRESERVAS POR HABITACION");
        System.out.println(reservasPorHabitacion);

        // 7. Facturación por ciudad

        Map<String, Double> facturacionPorCiudad = reservas.stream()
                .collect(
                        Collectors.groupingBy(
                                Reserva::getCiudadOrigen,
                                Collectors.summingDouble(
                                        Reserva::getImporte)));

        System.out.println("\nFACTURACION POR CIUDAD");
        System.out.println(facturacionPorCiudad);

        // 8. Reserva de mayor importe

        Optional<Reserva> mayor = reservas.stream()
                .max(Comparator.comparingDouble(
                        Reserva::getImporte));

        System.out.println("\nRESERVA DE MAYOR IMPORTE");
        mayor.ifPresent(System.out::println);

        // 9. Porcentaje superiores a 300 €

        long superiores = reservas.stream()
                .filter(r -> r.getImporte() > 300)
                .count();

        double porcentaje = (double) superiores * 100 / reservas.size();

        System.out.println("\nPORCENTAJE MAYORES DE 300");
        System.out.println(porcentaje + "%");

        // 10. Servicios sin duplicados

        List<String> servicios = reservas.stream()
                .map(Reserva::getServicios)
                .filter(s -> !s.equals("ninguno"))
                .flatMap(s -> Stream.of(s.split(",")))
                .distinct()
                .sorted()
                .toList();

        System.out.println("\nSERVICIOS");
        servicios.forEach(System.out::println);

        // 11. Veces que aparece cada servicio

        Map<String, Long> conteoServicios = reservas.stream()
                .map(Reserva::getServicios)
                .filter(s -> !s.equals("ninguno"))
                .flatMap(s -> Stream.of(s.split(",")))
                .collect(
                        Collectors.groupingBy(
                                servicio -> servicio,
                                Collectors.counting()));

        System.out.println("\nCONTEO SERVICIOS");
        System.out.println(conteoServicios);

        // 12. Separar en dos grupos

        Map<Boolean, List<Reserva>> grupos = reservas.stream()
                .collect(
                        Collectors.partitioningBy(
                                r -> r.getImporte() > 300));

        System.out.println("\nMAYORES DE 300");
        System.out.println(grupos.get(true));

        System.out.println("\nMENORES O IGUALES A 300");
        System.out.println(grupos.get(false));

        // 13. Tres reservas más caras

        System.out.println("\nTRES RESERVAS MAS CARAS");

        reservas.stream()
                .sorted(
                        Comparator.comparingDouble(
                                Reserva::getImporte)
                                .reversed())
                .limit(3)
                .forEach(System.out::println);

        // 14. Peek

        System.out.println("\nPEEK");

        reservas.stream()
                .peek(r -> System.out.println("Antes: " + r))
                .filter(r -> r.getImporte() > 300)
                .peek(r -> System.out.println("Despues: " + r))
                .forEach(r -> {
                });

        // 15. Generar fichero reservas_caras.txt

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("reservas_caras.txt"))) {

            reservas.stream()
                    .filter(r -> r.getImporte() > 300)
                    .forEach(r -> {
                        try {
                            writer.write(r.toString());
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            System.out.println("Error al escribir fichero");
        }
    }

    private static void fillData() {

        Path ruta = Path.of("reservas.txt");

        if (Files.exists(ruta)) {
            return;
        }

        List<String> datos = List.of(
                "1;Ana;Bilbao;Suite;3;180.00;desayuno,spa",
                "2;Pedro;Madrid;Doble;2;95.00;desayuno",
                "3;Ane;Bilbao;Individual;4;65.00;ninguno",
                "4;Luis;Vitoria;Suite;2;180.00;spa,parking",
                "5;Marta;Bilbao;Doble;5;95.00;desayuno,parking",
                "6;Jon;Donostia;Individual;1;65.00;ninguno",
                "7;Aitor;Bilbao;Suite;2;180.00;desayuno,spa,parking",
                "8;Laura;Madrid;Doble;3;95.00;parking",
                "9;Iker;Bilbao;Doble;1;95.00;desayuno",
                "10;Nerea;Vitoria;Individual;6;65.00;spa",
                "11;Maite;Donostia;Suite;4;180.00;desayuno",
                "12;Unai;Madrid;Individual;2;65.00;ninguno");

        try {
            Files.write(ruta, datos);
        } catch (IOException e) {
            System.out.println("Error al crear reservas.txt");
        }

    }
}