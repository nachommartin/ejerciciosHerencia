package JuegoJaca;

public class Jugador extends Elemento{
		
	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;
	
	public Jugador(char simbolo, int fil, int col) {
		super(simbolo);
		// TODO Auto-generated constructor stub
		this.fil=fil;
		this.col=col;
	}
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getGemas() {
		return gemas;
	}

	public void setGemas(int gemas) {
		this.gemas = gemas;
	}

	public int nextFil(Character fila) {
		int aux= 0;
		if (fila.equals('N') && this.fil==0) {
			aux= 9;}
		if (fila.equals('S') && this.fil==9) {
			aux= 0;}
		if (fila.equals('N')) {
			aux= this.fil-1;}
		if (fila.equals('S')) {
			aux=this.fil+1;}
		return aux;
	}
	
	public int nextCol(Character columna) {
		int aux=0;
		if (columna.equals('O') && this.col==0) {
			aux= 9;}
		if (columna.equals('E') && this.col==9) {
			aux= 0;}
		if (columna.equals('O')) {
			aux= this.col-1;}
		if (columna.equals('E')) {
			aux=this.col+1;}		
		return aux;	
	}
	
	
	public String Resumen() {
		return "Jugador [dinero=" + dinero + ", pociones=" + pociones + ", gemas=" + gemas + "]";
	}
	
	@Override
	public String toString() {
		return "Jugador [toString()=" + super.toString() + "]";
	}
	
	

	
	
}
