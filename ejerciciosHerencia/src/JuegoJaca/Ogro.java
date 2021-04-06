package JuegoJaca;

import LogicaJuego.Constante;

public class Ogro extends Jugador{
	
	public Ogro(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setFuerza(Constante.OGRO_FUERZA);
		super.setMagia(Constante.OGRO_MAGIA);
		super.setVelocidad(Constante.OGRO_VELOCIDAD);
		super.setDinero(0);
		super.setPociones(0);
		super.setGemas(0);
	}

}
