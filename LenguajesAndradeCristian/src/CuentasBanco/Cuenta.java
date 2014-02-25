package CuentasBanco;
public abstract class Cuenta {
private int id;
private String nombre;
private float saldo;

public abstract void crearCuenta();

public void setId(int id){
    this.id= id;
}
public int getId(){
    return id;
}
public String getNombre() {
    return nombre;
    }

public void setNombre(String nombre) {
    this.nombre = nombre;
  }

public float getSaldo() {
    return saldo;
    }

public void setSaldo(float saldo) {
    this.saldo = saldo;
    }
}
