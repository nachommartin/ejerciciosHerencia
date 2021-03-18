package JuegoJaca;

import LogicaJuego.Constante;

public class Ogro extends Jugador{
	private int fuerza=Constante.OGRO_FUERZA;
	private int magia=Constante.OGRO_MAGIA;
	private int velocidad= Constante.OGRO_VELOCIDAD;
	private int dinero= 0;
	private int pociones= 0;
	private int gemas= 0;

	public Ogro(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		// TODO Auto-generated constructor stub
	}

}
