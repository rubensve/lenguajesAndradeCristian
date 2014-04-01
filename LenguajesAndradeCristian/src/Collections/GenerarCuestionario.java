package Collections;

import java.util.*;

public class GenerarCuestionario {

   public static ArrayList<Pregunta> obtenerCuestionario(){
     
       Opcion op11= new Opcion("El Salvador", false, 1);
       Opcion op12= new Opcion("Peru", false, 2);
       Opcion op13= new Opcion("Mexico", false, 3);
       Opcion op14= new Opcion("Finlandia", true, 4);
       
 
       ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();
       opciones1.add(op11);
       opciones1.add(op12);
       opciones1.add(op13);
       opciones1.add(op14);
       
       
       Opcion op21= new Opcion("Superman", false, 1);
       Opcion op22= new Opcion("Batman", false, 2);
       Opcion op23= new Opcion("Hulk", false, 3);
       Opcion op24= new Opcion("Rubens", true, 4);
       
 
       ArrayList<Opcion> opciones2 = new ArrayList<Opcion>();
       opciones2.add(op21);
       opciones2.add(op22);
       opciones2.add(op23);
       opciones2.add(op24);
       
       Pregunta p1= new Pregunta("1.¿Cual es el pais con el mejor sistema educativo?", opciones1, 1);
       Pregunta p2= new Pregunta("2.¿Cual es tu heroe favorito?", opciones2, 2);
       
      ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
       cuestionario.add(p1);
       cuestionario.add(p2);
 return cuestionario;
}
}