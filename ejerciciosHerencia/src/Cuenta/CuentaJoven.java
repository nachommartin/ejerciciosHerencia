package Cuenta;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CuentaJoven extends Cuenta{
private String titular;
private static final double BONIFICACION=0.2;
private LocalDate fechaNacimiento;
private String msg3="No está en el rango de edad";

public CuentaJoven(String numCuenta) {
super(numCuenta);
// TODO Auto-generated constructor stub
}

public CuentaJoven(String titular, LocalDate fechaNacimiento, String numCuenta, double saldo) throws Exception {
super(numCuenta, saldo);
this.titular = titular;
this.fechaNacimiento = fechaNacimiento;
if (!esTitularValido())  { throw new Exception (msg3);}
}

public CuentaJoven(String titular, LocalDate fechaNacimiento,String numCuenta) throws Exception {
super(numCuenta);
this.titular = titular;
this.fechaNacimiento = fechaNacimiento;
}

public String getTitular() {
return titular;
}

public void setTitular(String titular) {
this.titular = titular;
}

public LocalDate getFechaNacimiento() {
return fechaNacimiento;
}

public void setFechaNacimiento(LocalDate fechaNacimiento) {
this.fechaNacimiento = fechaNacimiento;
}

@Override
public String toString() {
return "Esta cuenta es de " + titular + " con un número de cuenta "  + getNumCuenta() + "";
}
public boolean esTitularValido() {
LocalDate fechaCumple= this.fechaNacimiento;
LocalDate fechaActual= LocalDate.now();
long aux = ChronoUnit.YEARS.between(fechaCumple,fechaActual);
if (aux <= 25 && aux>18) {
return true;}
else {
return false;
}
}

public void reintegro(double cant) throws Exception {
if (cant <= super.getSaldo() && cant >0) {
super.setSaldo(super.getSaldo()-cant);
}else {
throw new Exception (msg2);
}

}

public void mostrar () {
double SaldoBonificado = super.getSaldo() + (super.getSaldo()*this.BONIFICACION);
System.out.println("" + toString() + " con un saldo de " + SaldoBonificado + "" );
}

}
