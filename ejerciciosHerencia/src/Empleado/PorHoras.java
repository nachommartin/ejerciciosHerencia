package Empleado;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PorHoras extends Empleado {

private int numHoras;
private double precioHora;


public PorHoras(String nombre, int edad, String nIF, double sueldo, int numHoras, double precioHora) {
	super(nombre, edad, nIF, sueldo);
	// TODO Auto-generated constructor stub
	this.numHoras=numHoras;
	this.precioHora=precioHora;
}

public PorHoras(String nombre, int edad, String nIF, int numHoras, double precioHora) {
	super(nombre, edad, nIF);
	this.numHoras=numHoras;
	this.precioHora=precioHora;
}
public int getNumHoras() {
	return numHoras;
}


public double getPrecioHora() {
	return precioHora;
}


@Override
public String toString() {
	return "" + super.toString() + " y un salario de " + salarioEmpleado() + " euros como empleado por horas";
}
public double salarioEmpleado() {
	// TODO Auto-generated method stub
	double salario = this.numHoras * this.precioHora;
	return salario;

}
}