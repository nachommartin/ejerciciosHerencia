package Vehiculo;

public class Furgoneta extends Vehiculo {
	
	private double PMA;
	private static final double PRECIOBASE=0.5;
	
	public Furgoneta(String matricula, String gama, double PMA) throws VehiculoException {
		super(matricula, gama);
		// TODO Auto-generated constructor stub
		if (this.PMA<0) 
			throw new VehiculoException("El peso no es correcto");
		this.PMA=PMA; 
	}

	public double getPMA() {
		return PMA;
	}



	public static double getPreciobase() {
		return PRECIOBASE;
	}


	
	@Override
	public String toString() {
		return "" + super.toString()+ "";
}
	
	public double precioVehiculo() {
		double aux= this.PMA * PRECIOBASE;
		return aux; 
	}
}
