package JuegoJaca;
import LogicaJuego.Constante; 

public class Mago extends Jugador {
	
	private int fuerza=Constante.MAGO_FUERZA;
	private int magia=Constante.MAGO_MAGIA;
	private int velocidad= Constante.MAGO_VELOCIDAD;
	private int dinero= 0;
	private int pociones= 0;
	private int gemas= 0;
	

	public Mago(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		// TODO Auto-generated constructor stub
	}

}
