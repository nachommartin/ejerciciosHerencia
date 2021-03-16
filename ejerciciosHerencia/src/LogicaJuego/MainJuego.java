package LogicaJuego;
import java.util.Scanner;

public class MainJuego {
	
	public static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJugadores = leerEntero("Cuántos jugadores?");
		Juego j = new Juego(numJugadores);
		System.out.println(j);

	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		int aux= Integer.parseInt(teclado.nextLine());
		return aux;
	}

}
