package Tarea2;
public class TestImagen {
public static void main(String[] args) {

    Imagen img1 = new Imagen();
    Imagen img2 = new Imagen();
    
    
    img1.setAlto(-10);
    img1.setAncho(-30);
    
    System.out.println(img1.getAlto());
    System.out.println(img1.getAncho());

    
    img2.setAlto(5);
    img2.setAncho(15);
    
    System.out.println(img2.getAlto());
    System.out.println(img2.getAncho());
}
    
}
