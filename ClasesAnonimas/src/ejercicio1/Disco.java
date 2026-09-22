package ejercicio1;

public class Disco implements Comparable<Object> {
    private String nombre;
    private String grupo;

    @Override
    public int compareTo(Object o) {
        Disco disco = (Disco) o;
        return this.nombre.length() - disco.nombre.length();
    }

    @Override
    public String toString() {
        return "Disco [nombre=" + nombre + ", grupo=" + grupo + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Disco(String nombre, String grupo) {
        super();
        this.nombre = nombre;
        this.grupo = grupo;
    }
}