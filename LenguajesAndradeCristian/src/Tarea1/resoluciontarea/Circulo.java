package Tarea1.resoluciontarea;
public class Circulo {
    private float radio;

//Metodo set o mutador, debe ser public. Metodo sin retorno

    public void setRadio(float radio){
        if(radio<0)radio=-radio;
        this.radio=radio;
    }
    //Metodo get sirve para obtener el dato y debe de tener el mismo tipo de retorno
    public float getRadio(){
        return radio;
    }
}
