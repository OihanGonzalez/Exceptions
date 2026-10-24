package StreamsII.Ejercicio5;

public class Reserva {

    private int id;
    private String cliente;
    private String ciudadOrigen;
    private String tipoHabitacion;
    private int noches;
    private double precioNoche;
    private String servicios;

    public Reserva(int id, String cliente, String ciudadOrigen,
                   String tipoHabitacion, int noches,
                   double precioNoche, String servicios) {

        this.id = id;
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.tipoHabitacion = tipoHabitacion;
        this.noches = noches;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getNoches() {
        return noches;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public String getServicios() {
        return servicios;
    }

    public double getImporte() {
        return noches * precioNoche;
    }

    @Override
    public String toString() {
        return id + " - " +
                cliente + " - " +
                ciudadOrigen + " - " +
                tipoHabitacion + " - " +
                noches + " - " +
                precioNoche + " - " +
                servicios;
    }
}