package Empleado;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private String NIF;
	private double sueldo;
	
	
	public Empleado(String nombre, int edad, String nIF, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		NIF = nIF;
		this.sueldo = sueldo;
	}
	
	

	public Empleado(String nombre, int edad, String nIF) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		NIF = nIF;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NIF == null) ? 0 : NIF.hashCode());
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
		Empleado other = (Empleado) obj;
		if (NIF == null) {
			if (other.NIF != null)
				return false;
		} else if (!NIF.equals(other.NIF))
			return false;
		return true;
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public String getNIF() {
		return NIF;
	}


	public double getSueldo() {
		return sueldo;
	}


	@Override
	public String toString() {
		return "Este empleado se llama " + nombre + " con " + edad + " años de edad y NIF número " + NIF + "";
	}

	public abstract double salarioEmpleado();


}
