package JuegoJaca;
import LogicaJuego.Constante; 

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
		int aux= this.fil;
		if (fila.equals('N') && this.fil==0) {
			aux= Constante.ALTO-1;}
		if (fila.equals('S') && this.fil==Constante.ALTO-1) {
			aux= 0;}
		if (fila.equals('N')) {
			aux= this.fil--;}
		if (fila.equals('S')) {
			aux=this.fil++;}
		return aux;
	}
	
	public int nextCol(Character columna) {
		int aux=this.col;
		if (columna.equals('O') && this.col==0) {
			aux= Constante.ANCHO-1;}
		if (columna.equals('E') && this.col==Constante.ANCHO-1) {
			aux= 0;}
		if (columna.equals('O')) {
			aux= this.col--;}
		if (columna.equals('E')) {
			aux=this.col++;}		
		return aux;	
	}
	
	
	public String Resumen() {
		return "Jugador " + super.getSimbolo() + " Dinero: " + dinero + " Pociones:" + pociones + " Gemas:" + gemas + "";
	}
	
	@Override
	public String toString() {
		return "" + super.toString();
	}
	
	

	
	
}
