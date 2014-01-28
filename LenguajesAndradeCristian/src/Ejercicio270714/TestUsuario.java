package Ejercicio270714;
public class TestUsuario {

    public static void main(String[] args) {
Usuario usuario1= new Usuario();
Usuario usuario2= new Usuario();

usuario1.setNombre("Ruben Veloz");
usuario1.setEdad(5);

System.out.println(usuario1.getEdad());
System.out.println(usuario1.getNombre());

usuario2.setNombre("Cristian Andrade");
usuario2.setEdad(20);

System.out.println(usuario2.getEdad());
System.out.println(usuario2.getNombre());
    }
    
}
