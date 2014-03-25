package threads;
import java.util.*;

public class Reloj{
    public static void main(String args[]){
   Thread t1= new Thread(new Runnable(){
   public void run(){
       while(true){
       try {
           Thread.sleep(1000);
    //CREAREMOS UN OBJETO DE LA CLASE CALENDAR 
       Calendar cal= Calendar.getInstance();
       int hora= cal.get(Calendar.HOUR_OF_DAY);
       int minuto= cal.get(Calendar.MINUTE);
       int segundo= cal.get(Calendar.SECOND);
       String time= hora+ ":"+minuto+":"+segundo;
       System.out.println("Son las: "+time);
       } catch (InterruptedException ex) {
       }}
}
   });
    t1.start();
    }
}
