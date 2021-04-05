package LogicaJuego;
import java.util.Scanner;

import Barco.AlquilerException;
import JuegoJaca.Elemento;
import JuegoJaca.Jugador;

public class MainJuego {
	
	public static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) throws JuegoException  {
		// TODO Auto-generated method stub
		try {
		int numJugadores = leerEntero("Cuántos jugadores?");
		int aux;
		Juego j = new Juego(numJugadores);
		System.out.println(j);
		for (aux=0; aux <numJugadores; aux++) { 
		char caracter= leerCaracter("Elige jugador:\n (E)lfo\n (G)uerrero\n (M)ago\n (O)gro");
		j.crearJugador(caracter); 		
		}
		do {

		System.out.println(j);
		System.out.println(j.imprimeNombreJugadores());
		System.out.println(j.imprimeValoreJugadores());
		System.out.println(j.getJugadorTurno());
		int dado= j.getMovimientoJugador();
		System.out.println("La tirada es " + dado);

		
		for (int aux2 = 0; aux2 < dado && !j.isTerminado(); aux2++ ) {
			char direccion = leerCaracter("¿Elige orientación:\n (N)orte\n (S)ur\n (E)ste\n (O)este");
			System.out.println(j.moverJugador(direccion));
			System.out.println(j);
			j.compruebaFinJuego();
		}
		j.proximoJugador();
		}
		while (!j.isTerminado());
			System.out.println(j.getGanador());
		}
		catch (JuegoException je) {
			System.out.println(je.getMessage());
		} 
		}
		

	
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		int aux= Integer.parseInt(teclado.nextLine());
		return aux;
	}
	public static char leerCaracter(String msg) {
		System.out.println(msg);
		String cadena= (teclado.nextLine());
		return cadena.charAt(0);
	}	

}
