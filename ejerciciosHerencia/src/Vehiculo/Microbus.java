package Vehiculo;

public class Microbus extends Vehiculo {
	
	private int plaza;
	private static final double PRECIOPLAZA=5;
	
	public Microbus(String matricula, String gama, int plaza) throws VehiculoException {
		super(matricula, gama);
		// TODO Auto-generated constructor stub
		if (this.plaza <0)
			throw new VehiculoException ("Insuficiente número de plazas");
		this.plaza=plaza;
	}

	
	public int getPlaza() {
		return plaza;
	}

	public static double getPrecioplaza() {
		return PRECIOPLAZA;
	}
	
	@Override
	public String toString() {
		return "" + super.toString() + "";
	}
	
	public double precioVehiculo() {
		double aux = this.plaza * PRECIOPLAZA;
		return aux; 
	}
}
