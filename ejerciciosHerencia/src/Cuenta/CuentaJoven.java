package Cuenta;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CuentaJoven extends Cuenta {
private String titular;
private static final double BONIFICACION=0.20;
private LocalDate fechaNacimiento;

public CuentaJoven(String numCuenta) {
	super(numCuenta);
	// TODO Auto-generated constructor stub
}

public CuentaJoven(String titular, LocalDate fechaNacimiento, String numCuenta, double saldo) throws Exception {
	super(numCuenta, saldo);
	this.titular = titular;
	this.fechaNacimiento = fechaNacimiento;
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
	return "CuentaJoven [titular=" + titular + ", getSaldo()=" + getSaldo() + ", getNumCuenta()=" + getNumCuenta()
			+ "]";
}
public boolean esTitularValido() {
	LocalDate fechaCumple= this.fechaNacimiento;
	LocalDate fechaActual= LocalDate.now();
	long aux = ChronoUnit.YEARS.between(fechaCumple,fechaActual);
	if (aux <= 25) {
		return true;}
	else {
		return false;
	}
	}

}
