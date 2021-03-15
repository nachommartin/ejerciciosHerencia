package LogicaJuego;

import JuegoJaca.Elemento;
import JuegoJaca.Jugador;

public class Juego {
		private Elemento tablero[][]; 
		private Jugador jugadores[];
		private int alto= Constante.ALTO;
		private int ancho= Constante.ANCHO;
		private int numJugadores;
		private boolean finished=false;
		private int jugadorJuega;
		
		
		public Juego(int alto, int ancho, int numJugadores) {
			super();
			this.alto = alto;
			this.ancho = ancho;
			this.numJugadores = numJugadores;
		}


		public Juego(int numJugadores) {
			super();
			this.numJugadores = numJugadores;
		} 
		
		private void crearTablero() {
			this.tablero = new Elemento [Constante.ALTO][Constante.ANCHO];
		}
		
		
		public void crearJugador(char caracter) {
		}
		
		private void crearRoca () {
		int fila, col;
			do {
			fila = (int) (Math.random() * this.alto);
			col = (int) (Math.random() * this.ancho);
			} while (tablero[fila][col] != null);

			
		}
}