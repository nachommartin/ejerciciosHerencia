package Barco;
import java.time.LocalDate;

public class Alquiler {
private String nombre;
private String DNI;
private LocalDate fechaInicial;
private LocalDate fechaFinal;
private int amarre;
private Barco barco;


public Alquiler(String nombre, String DNI, Barco barco) {
	super();
	this.nombre = nombre;
	this.DNI = DNI;
	this.barco = barco;
}


public String getNombre() {
	return nombre;
}


public String getDNI() {
	return DNI;
}


public LocalDate getFechaInicial() {
	return fechaInicial;
}


public LocalDate getFechaFinal() {
	return fechaFinal;
}


public int getAmarre() {
	return amarre;
}


public Barco getBarco() {
	return barco;
}


@Override
public String toString() {
	return "Alquiler [nombre=" + nombre + ", DNI=" + DNI + ", fechaFinal=" + fechaFinal + ", barco=" + barco + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
	result = prime * result + ((barco == null) ? 0 : barco.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Alquiler other = (Alquiler) obj;
	if (DNI == null) {
		if (other.DNI != null)
			return false;
	} else if (!DNI.equals(other.DNI))
		return false;
	if (barco == null) {
		if (other.barco != null)
			return false;
	} else if (!barco.equals(other.barco))
		return false;
	return true;
}


}
