package Empleado;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Fijo extends Empleado {

private LocalDate fechaInicio;
private static final int COMPLEMENTO = 20; 


public Fijo(String nombre, int edad, String nIF, double sueldo, LocalDate fechaInicio) {
	super(nombre, edad, nIF, sueldo);
	// TODO Auto-generated constructor stub
	this.fechaInicio=fechaInicio;
}

public LocalDate getFechaInicio() {
	return fechaInicio;
}

@Override
public String toString() {
	return "" + super.toString() + " y un salario de " + salarioEmpleado() + " euros como empleado fijo";
}

@Override
public double salarioEmpleado() {
	// TODO Auto-generated method stub
	long aux = ChronoUnit.YEARS.between(this.fechaInicio,LocalDate.now());
	double salario = super.getSueldo() + (aux*COMPLEMENTO);
	return salario;
}

}
