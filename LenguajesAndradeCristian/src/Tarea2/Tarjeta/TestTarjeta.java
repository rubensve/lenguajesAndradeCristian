package Tarea2.Tarjeta;
public class TestTarjeta {

    public static void main(String[] args) {
        Tarjeta usuario = new Tarjeta();
        Tarjeta usuario2= new Tarjeta();
        
        usuario.setNombreCliente("");
        usuario.setNumeroTarjeta(10);
        
        System.out.println(usuario.getNombreCliente());
         System.out.println(usuario.getNumeroTarjeta());
         
        usuario2.setNombreCliente("Luis");
        usuario2.setNumeroTarjeta(10);
        
        System.out.println(usuario2.getNombreCliente());
        System.out.println(usuario2.getNumeroTarjeta());
    }
    
}
