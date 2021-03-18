package JuegoJaca;

import LogicaJuego.Constante;

public class Elfo extends Jugador{
	
	private int fuerza=Constante.ELFO_FUERZA;
	private int magia=Constante.ELFO_MAGIA;
	private int velocidad= Constante.ELFO_VELOCIDAD;
	private int dinero= 0;
	private int pociones= 0;
	private int gemas= 0;

	public Elfo(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		// TODO Auto-generated constructor stub
	}

}
