package Tarea2.Tarjeta;
public class Tarjeta {
private int numeroTarjeta;
private String nombreCliente;

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        if(nombreCliente.equals(""))nombreCliente="Juan";
        this.nombreCliente = nombreCliente;
    }

}
