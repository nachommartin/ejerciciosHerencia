package Empleado;
import java.time.LocalDate;


public class Temporal extends Empleado {

private LocalDate fechaAlta;
private LocalDate fechaBaja;


public Temporal(String nombre, int edad, String nIF, double sueldo, LocalDate fechaAlta, LocalDate fechaBaja) {
	super(nombre, edad, nIF, sueldo);
	// TODO Auto-generated constructor stub
	this.fechaAlta=fechaAlta;
	this.fechaBaja=fechaBaja; 
}


public LocalDate getFechaAlta() {
	return fechaAlta;
}


public LocalDate getFechaBaja() {
	return fechaBaja;
}


@Override
public String toString() {
	return "" + super.toString() + " y un salario de " + salarioEmpleado() + " euros como empleado temporal";
}


@Override
public double salarioEmpleado() {
	// TODO Auto-generated method stub
	return super.getSueldo();
}

}
