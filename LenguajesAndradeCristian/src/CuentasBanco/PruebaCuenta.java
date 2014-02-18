package CuentasBanco;

public class PruebaCuenta {
    public static void main(String arg[]){
        CuentaAhorro cuenta1= new CuentaAhorro();
        cuenta1.setId(5);
        cuenta1.setNombre("Ruben");
        cuenta1.setSaldo(5500);

        
        CuentaDebito cuenta2= new CuentaDebito();
        cuenta2.setId(6);
        cuenta2.setNombre("Cristian");
        cuenta2.setSaldo(1200);
       
        CuentaNomina cuenta3= new CuentaNomina();
        cuenta3.setId(7);
        cuenta3.setNombre("Andrade");
        cuenta3.setSaldo(36590);
 
    }
}

