package JuegoJaca;

import LogicaJuego.Constante;

public class Guerrero extends Jugador{
	
	
	public Guerrero(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setFuerza(Constante.GUERRERO_FUERZA);
		super.setMagia(Constante.GUERRERO_MAGIA);
		super.setVelocidad(Constante.GUERRERO_VELOCIDAD);
		super.setDinero(0);
		super.setPociones(0);
		super.setGemas(0);	}

}
