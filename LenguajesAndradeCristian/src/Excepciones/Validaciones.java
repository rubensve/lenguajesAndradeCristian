package Excepciones;
public class Validaciones {
public static void validarEdad(int edad) throws EdadNegativaException{
    if (edad<18)throw new EdadNegativaException();
}    
}
