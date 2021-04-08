package JuegoJaca;
import LogicaJuego.Constante; 

public class Mago extends Jugador {
	

	public Mago(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setFuerza(Constante.MAGO_FUERZA);
		super.setMagia(Constante.MAGO_MAGIA);
		super.setVelocidad(Constante.MAGO_VELOCIDAD);
		super.setDinero(0);
		super.setPociones(0);
		super.setGemas(0);	}

}
