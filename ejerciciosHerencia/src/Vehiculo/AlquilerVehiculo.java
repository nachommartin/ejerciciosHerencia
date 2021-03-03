package Vehiculo;


public class AlquilerVehiculo {
	
	private Vehiculo vehiculo;
	private int diasAlquiler;
	
	
	
	public AlquilerVehiculo(Vehiculo vehiculo, int diasAlquiler) {
		super();
		this.vehiculo = vehiculo;
		this.diasAlquiler = diasAlquiler;
	}
	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}



	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	
	@Override
	public String toString() {
		return "AlquilerVehiculo [vehiculo=" + vehiculo + ", diasAlquiler=" + diasAlquiler + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
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
		AlquilerVehiculo other = (AlquilerVehiculo) obj;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}
	
	public double precioDia() {
		double aux=0; 
		if (vehiculo.getGama().equals("alta")) {
			aux = diasAlquiler * vehiculo.getPrecioalta();}
		else if (vehiculo.getGama().equals("media")) {
			aux = diasAlquiler * vehiculo.getPreciomedia();}
		else {
			aux = diasAlquiler * vehiculo.getPreciobaja();}
		return aux;
	}
	
	
	  public double precioAlquiler() {
		   double precio = this.vehiculo.precioVehiculo() + precioDia(); 
		   return precio;
	   }

}
