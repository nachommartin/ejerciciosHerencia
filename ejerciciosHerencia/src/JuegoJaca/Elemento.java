package JuegoJaca;

public abstract class Elemento {
	
	private char simbolo;

	public Elemento(char simbolo) {
		super();
		this.simbolo = simbolo;
	}
	
	@Override
	public String toString() {
		return "" + simbolo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + simbolo;
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
		Elemento other = (Elemento) obj;
		if (simbolo != other.simbolo)
			return false;
		return true;
	}
	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
}
