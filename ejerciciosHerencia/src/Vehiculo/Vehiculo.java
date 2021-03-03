package Vehiculo;


public abstract class Vehiculo {

private String matricula;
private String gama;
private static final double PRECIOBAJA = 30;
private static final double PRECIOMEDIA = 40;
private static final double PRECIOALTA = 50;




public Vehiculo(String matricula, String gama) throws VehiculoException{
	super();
	if (!gama.equals("baja") && !gama.equals("media") && !gama.equals("alta")) {
		throw new VehiculoException ("La gama no es la correcta");}
	this.matricula = matricula;
	this.gama = gama;
}
	
	public String getMatricula() {
		return matricula;
	}




	public String getGama() {
		return gama;
	}




	public static double getPreciobaja() {
		return PRECIOBAJA;
	}




	public static double getPreciomedia() {
		return PRECIOMEDIA;
	}




	public static double getPrecioalta() {
		return PRECIOALTA;

}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", gama=" + gama + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	public abstract double precioVehiculo();


}
