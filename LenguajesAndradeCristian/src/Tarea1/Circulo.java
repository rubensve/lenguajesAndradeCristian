package Tarea1;
import java.util.*;

public class Circulo {
    double radio;
 private double perimetros;
 private double areas;
 public void area(){
     areas=(3.1416)*(Math.pow(radio, 2));
     System.out.println("El valor del area es de: "+areas);
 }   
 public void peri(){
     perimetros= (2)*(Math.sqrt(Math.pow(radio, 2)));
 System.out.println("El valor del area es de: "+perimetros);
 }
}
