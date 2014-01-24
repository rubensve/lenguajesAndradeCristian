package Tarea1;
public class TestCirculo {

    public static void main(String[] args) {
        Circulo c= new Circulo();
        c.radio= -15;
        c.area();
        c.peri();
    } 
}
/*No entendi muy bien lo de impedir que el usuario ingrese numeros negativos
pero bueno hice un procedimiento dentro de la clase
para que aunque ingrese negativo el radio siempre sea positivo, espero y 
este bien, si no es asi me gustaria la retroalimentacion*/
