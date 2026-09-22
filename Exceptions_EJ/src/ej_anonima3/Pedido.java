package ej_anonima3;

public class Pedido {
    private int numero;
    private double importe;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Pedido(int numero, double importe) {
        this.numero = numero;
        this.importe = importe;
    }

}
