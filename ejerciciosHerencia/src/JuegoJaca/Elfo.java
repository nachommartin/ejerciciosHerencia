package JuegoJaca;

import LogicaJuego.Constante;

public class Elfo extends Jugador{
	public Elfo(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setFuerza(Constante.ELFO_FUERZA);
		super.setMagia(Constante.ELFO_MAGIA);
		super.setVelocidad(Constante.ELFO_VELOCIDAD);
		super.setDinero(0);
		super.setPociones(0);
		super.setGemas(0);	}

}
