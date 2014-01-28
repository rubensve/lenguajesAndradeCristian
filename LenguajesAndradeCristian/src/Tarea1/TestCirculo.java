package Tarea1;
public class TestCirculo {

    public static void main(String[] args) {
        Circulo c= new Circulo();
        c.radio= -15;
        c.area();
        c.peri();
        System.out.println(c.radio);
    } 
}
/*Al momento de correr la aplicacion solamente convierte el dato dentro de las funciones
pero no evita como tal que el radio ingresado sea negativo
Lo podemos observar al imprimir el valor del radio ya que nos da el numero negativo*/
