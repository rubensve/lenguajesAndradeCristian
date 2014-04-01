package Collections;
public class Opcion {

    public Opcion(String titulo, boolean valor) {
        this.titulo = titulo;
        this.valor = valor;
    }
    
private String titulo;
private boolean valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

}
