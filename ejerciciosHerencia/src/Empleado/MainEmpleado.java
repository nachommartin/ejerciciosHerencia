package Empleado;
import java.util.Scanner;
import java.time.LocalDate;

public class MainEmpleado {
	
public static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {
		// TODO Auto-generated method stub
Fijo f1= new Fijo ("Alberto", 34, "30250133A", 200.0, LocalDate.parse("1995-02-11"));
System.out.println(f1);
System.out.println(f1.salarioEmpleado());
PorHoras ph1= new PorHoras ("Benito", 23, "32250134B", 34, 10.0);
System.out.println(ph1);
System.out.println(ph1.salarioEmpleado());
Temporal t1= new Temporal ("Carlos", 29, "30250135C", 150.0, LocalDate.parse("1995-02-11"), LocalDate.parse("2021-04-18"));
System.out.println(t1);
System.out.println(t1.salarioEmpleado());
	}
}

