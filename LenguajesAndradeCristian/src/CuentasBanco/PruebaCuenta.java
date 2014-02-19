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
        
        for (int x=1; x<2; x++)
        {
         if (cuenta1.getClass().equals(CuentaAhorro.class)) {
        System.out.println("Cuenta de Ahorro creada con exito");}
         else {
                if (cuenta3.getClass().equals(CuentaDebito.class)) {
                System.out.println("Cuenta de Debito creada con exito");}
                else {
                    if (cuenta3.getClass().equals(CuentaNomina.class)) {
                System.out.println("Cuenta de Nomina creada con exito");}
                     }
               }
        }
 
    }
}

//Solo pude hacerlo manual, no pude hacer que el numero del objeto avanzara 
//conforme al for, lo unico que puedo hacer es ocupar el polimorfismo pero 
//le quitaria la emocion jajaja 
