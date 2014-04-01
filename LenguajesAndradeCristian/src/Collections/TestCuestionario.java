package Collections;
public class TestCuestionario {
    public static void main(String[] args) {

        for(Pregunta p: GenerarCuestionario.obtenerCuestionario() ){
        System.out.println(p.getTitulo());
        for(Opcion o: p.getOpciones()){
            System.out.println(o.getTitulo());
        }
    }
   
    }
    
}
