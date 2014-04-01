package Collections;
public class Opcion {

    public Opcion(String titulo, boolean valor, int id) {
        this.titulo = titulo;
        this.valor = valor;
        this.id=id;
    }
    
private String titulo;
private boolean valor;
private int id;

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
