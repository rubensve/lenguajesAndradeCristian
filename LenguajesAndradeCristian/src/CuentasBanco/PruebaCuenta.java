package CuentasBanco;

public class PruebaCuenta {
    public static void main(String arg[]){
        Cuenta []cuentas=new Cuenta[6];
      cuentas[0]=new CuentaAhorro();
      cuentas[1]=new CuentaDebito();
      cuentas[2]=new CuentaNomina();
      cuentas[3]=new CuentaAhorro();
      cuentas[4]=new CuentaNomina();
      cuentas[5]=new CuentaDebito();


      for(Cuenta c:cuentas){
          c.crearCuenta();
      }
    }
}
//Solo pude hacerlo manual, no pude hacer que el numero del objeto avanzara 
//conforme al for, lo unico que puedo hacer es ocupar el polimorfismo pero 
//le quitaria la emocion jajaja 
