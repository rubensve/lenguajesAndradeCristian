package Excepciones;
public class EdadNegativaException extends Exception {
    public EdadNegativaException(){
        super("Lo siento, debes ser mayor de 18 años");
        
    }
}
