package Serializacion;
public class TestUsuario {
public static void main(String args[])throws Exception{
    Usuario u= new Usuario("rubens4", 18, "ruben_veloz@hotmail.com");
    GuardarUsuario.guardar(u);
    System.out.println(GuardarUsuario.leer());
}    
}
