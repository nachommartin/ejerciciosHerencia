package Barco;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

private String nombre;
private String DNI;
private LocalDate fechaInicial=LocalDate.now();
private LocalDate fechaFinal;
private int amarre;
private Barco barco;
private static final int VALORFIJO= 20;


public Alquiler(String nombre, String DNI, LocalDate fechaFinal, int amarre, Barco barco) {
super();
this.nombre = nombre;
this.DNI = DNI;
this.fechaFinal= fechaFinal;
this.amarre= amarre;
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
return "El alquiler es de " + nombre + " con DNI " + DNI + " hasta " + fechaFinal + " en el amarre " + amarre + " para el barco " + barco + "";
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

   public double precioAlquiler() {
  long aux = ChronoUnit.DAYS.between(this.fechaInicial,this.fechaFinal);
  double precio = this.barco.precioBarco() * aux * VALORFIJO;
  return precio;
   }
}



