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
		System.out.println(j);
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
