package Tarea2;
public class Imagen {
    
    private int alto, ancho;

public int getAlto(){
    return alto;
}

public void setAlto(int alto){
    if(alto<0)alto=-alto;
    this.alto=alto;
}

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho<0)ancho=-ancho;
        this.ancho = ancho;
    } 
}
