package Collections;

import java.util.*;

public class Pregunta {

public Pregunta(String titulo, ArrayList<Opcion> opciones, int id) {
this.titulo = titulo;
this.opciones = opciones;
this.id=id;
    }

private String titulo;
private ArrayList<Opcion> opciones;
private int id;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

}

