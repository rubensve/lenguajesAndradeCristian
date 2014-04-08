package Serializacion;

import java.io.*;
import java.util.*;

public class GuardarUsuario {
    
    public static synchronized void guardar(Usuario u) throws Exception{
       ArrayList<Usuario> u1 = new ArrayList<Usuario>();
        
        File file= new File("archivaldo.xxx");
        if(file.exists()) {
      u1= GuardarUsuario.leer();
         u1.add(u);
        }
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(u1);
    }  
      public static synchronized ArrayList<Usuario> leer() throws Exception{
        File file= new File("archivaldo.xxx");
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        ArrayList<Usuario> u= (ArrayList<Usuario>)ois.readObject();
        return u;
    } 
}