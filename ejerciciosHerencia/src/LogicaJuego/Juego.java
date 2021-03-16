package LogicaJuego;

import JuegoJaca.Elemento;
import JuegoJaca.Jugador;
import JuegoJaca.Roca;
import java.util.Arrays;
import JuegoJaca.Arbol;
import JuegoJaca.Dinero;
import JuegoJaca.Pocion;
import JuegoJaca.Gema;
import JuegoJaca.Elemento;

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
			crearTablero();

		}


		public Juego(int numJugadores) {
			super();
			this.numJugadores = numJugadores;
			crearTablero();
		} 
		
		private void crearTablero() {
			this.tablero = new Elemento [this.alto][this.ancho];
			crearRoca(); 
			crearGema(); 
			crearPocion(); 
			crearDinero(); 
		}
		
		
		public void crearJugador(char caracter) {
			int fila, col;
			do {
			fila = (int) (Math.random() * this.alto);
			col = (int) (Math.random() * this.ancho);
			} while (tablero[fila][col] != null);
			tablero[fila][col]=new Jugador(caracter, this.alto,this.ancho);
		}
		
		private void crearRoca () {
		int fila, col;
			do {
			fila = (int) (Math.random() * (this.alto-1));
			col = (int) (Math.random() * (this.ancho-1));
			} while (tablero[fila][col] != null);
			tablero[fila][col]=new Roca(Constante.ROCA);			
		}
		
		private void crearGema () {
			int fila, col;
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Gema(Constante.GEMA);			
		}
		
		private void crearPocion () {
			int fila, col;
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Pocion(Constante.POCION);			
			}
			
		private void crearDinero () {
			int fila, col;
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Dinero (Constante.DINERO);			
			}
			
		
		@Override
		public String toString() {
			StringBuilder resul = new StringBuilder();
			int fila, col;		
			for(fila = 0; fila < Constante.ALTO-1; fila++){ 
				resul.append("|");
				for(col = 0; col < Constante.ANCHO-1; col++){ 
					resul.append("_");} 
					if (tablero[fila][col]== null) {
					resul.append(" |");} 
					else {
						resul.append(tablero[fila][col] + "|");} 
				}
			return resul.toString();
			}

}