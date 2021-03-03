package Vehiculo;

public class Coche extends Vehiculo{

private String carburante; 
private static final double PRECIOGASOLINA = 3.5;
private static final double PRECIODIESEL = 2;

public Coche(String matricula, String gama, String carburante) throws VehiculoException {
	super(matricula, gama);
	// TODO Auto-generated constructor stub
	if (!this.carburante.equals("gasolina") && !this.carburante.equals("diesel")) {
		throw new VehiculoException ("La gama no es la correcta");}
	this.carburante=carburante;
}

public String getCarburante() {
	return carburante;
}

public static double getPreciogasolina() {
	return PRECIOGASOLINA;
}

public static double getPreciodiesel() {
	return PRECIODIESEL;
}

@Override
public String toString() {
	return "Coche [carburante=" + carburante + ", toString()=" + super.toString() + "]";
}

@Override
public double precioVehiculo() {
	// TODO Auto-generated method stub
	if (carburante.equals("gasolina")){
		return PRECIOGASOLINA;}
	else {
		return PRECIODIESEL;}
}
}
