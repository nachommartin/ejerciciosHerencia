package JuegoJaca;

import LogicaJuego.Constante;

public class Guerrero extends Jugador{
	
	private int fuerza=Constante.GUERRERO_FUERZA;
	private int magia=Constante.GUERRERO_MAGIA;
	private int velocidad= Constante.GUERRERO_VELOCIDAD;
	private int dinero= 0;
	private int pociones= 0;
	private int gemas= 0;
	
	public Guerrero(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		// TODO Auto-generated constructor stub
	}

}
