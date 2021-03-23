package LogicaJuego;

import JuegoJaca.Elemento;
import JuegoJaca.Jugador;
import JuegoJaca.Roca;
import java.util.Arrays;

import Barco.AlquilerException;
import JuegoJaca.Arbol;
import JuegoJaca.Dinero;
import JuegoJaca.Pocion;
import JuegoJaca.Gema;
import JuegoJaca.Elemento;
import JuegoJaca.Elfo;
import JuegoJaca.Guerrero;
import JuegoJaca.Mago;
import JuegoJaca.Ogro;


public class Juego {
		
		private Elemento tablero[][]; 
		private Jugador jugadores[];
		private int alto= Constante.ALTO;
		private int ancho= Constante.ANCHO;
		private int numJugadores;
		private boolean finished=false;
		private int jugadorJuega;
		
		
		public Juego(int alto, int ancho, int numJugadores) throws JuegoException {
			super();
			if (numJugadores<2 || numJugadores>6) {
				throw new JuegoException ("Número de jugadores incorrecto");}
			this.alto = alto;
			this.ancho = ancho;
			this.numJugadores = numJugadores;
			this.jugadores= new Jugador [numJugadores];
			this.jugadorJuega= (int) (Math.random() * numJugadores);
			crearTablero();

		}


		public Juego(int numJugadores) throws JuegoException {
			super();
			if (numJugadores<2 || numJugadores>6) {
				throw new JuegoException ("Número de jugadores incorrecto");}
			this.numJugadores = numJugadores;
			this.jugadores= new Jugador [numJugadores];
			this.jugadorJuega= (int) (Math.random() * numJugadores);
			crearTablero();
		} 
		
		private void crearTablero() {
			this.tablero = new Elemento [this.alto][this.ancho];
			crearRoca(); 
			crearGema(); 
			crearPocion(); 
			crearDinero(); 
			crearArbol();
		}
		
		
		public void crearJugador(char caracter) {
			int fila, col;
			do {
			fila = (int) (Math.random() * this.alto);
			col = (int) (Math.random() * this.ancho);
			} while (tablero[fila][col] != null); /*posicion matriz*/
			
			int aux;
			boolean encontrado=false;
			for (aux=0; aux <=numJugadores-1 && !encontrado; aux++) {
				if (jugadores[aux]==null) {
					encontrado=true;  }
				} /*posicion array*/
					
			switch (caracter) {
				case 'E':	{
					Jugador j=new Elfo(Constante.NOMBRE_JUGADORES[aux-1], this.alto,this.ancho);
					tablero[fila][col]= j;
					jugadores[aux-1]=j; 
					break;
				}
				case 'G':	{
					Jugador j=new Guerrero(Constante.NOMBRE_JUGADORES[aux-1], this.alto,this.ancho);
					tablero[fila][col]= j;
					jugadores[aux-1]=j; 
					break;
				}
				case 'M':	{
					Jugador j=new Mago (Constante.NOMBRE_JUGADORES[aux-1], this.alto,this.ancho);
					tablero[fila][col]= j;
					jugadores[aux-1]=j; 
					break;
				}
				case 'O':	{
					Jugador j=new Ogro(Constante.NOMBRE_JUGADORES[aux-1], this.alto,this.ancho);
					tablero[fila][col]= j;
					jugadores[aux-1]=j; 
					break;
				}
			}
		}
		
		private void crearRoca () {
		int fila, col;
		int aux;
		for (aux= 0; aux < Constante.NUM_ROCAS; aux++) {
			do {
			fila = (int) (Math.random() * (this.alto-1));
			col = (int) (Math.random() * (this.ancho-1));
			} while (tablero[fila][col] != null);
			tablero[fila][col]=new Roca(Constante.ROCA);			
		}
}
		
		private void crearGema () {
			int fila, col;
			int aux; 
			for (aux= 0; aux < Constante.NUM_GEMAS; aux++) {
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Gema(Constante.GEMA);			
		}
		}
		
		private void crearPocion () {
			int fila, col;
			int aux;
			for (aux= 0; aux < Constante.NUM_POCIONES; aux++) {
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Pocion(Constante.POCION);			
			}
		}
			
		private void crearDinero () {
			int fila, col;
			int aux;
			for (aux= 0; aux < Constante.NUM_DINERO; aux++) {
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Dinero (Constante.DINERO);			
			}
		}
		
		private void crearArbol () {
			int fila, col;
			int aux;
			for (aux= 0; aux < Constante.NUM_ARBOLES; aux++) {
				do {
				fila = (int) (Math.random() * this.alto-1);
				col = (int) (Math.random() * this.ancho-1);
				} while (tablero[fila][col] != null);
				tablero[fila][col]=new Dinero (Constante.ARBOL);			
			}
		}
		
		private String barra() {
			return "----------------------------\n"; 
		}
		
		@Override
		public String toString() {
			StringBuilder resul = new StringBuilder();
			int fila, col;	
			for(fila = 0; fila < Constante.ALTO-1; fila++){ 
				resul.append(barra());
				resul.append("|");
				for(col = 0; col < Constante.ANCHO-1; col++){ 
					resul.append(" ");
					if (tablero[fila][col]== null) {
					resul.append(" |");} 
					else {
						resul.append(tablero[fila][col] + "|");} 
				}
				resul.append("\n");
			}
			resul.append(barra());
			return resul.toString();
			}
		
		public boolean isTerminado() {
			return finished;
		}
		
		public String imprimeNombreJugadores() {
		StringBuilder cadena = new StringBuilder();
		int aux; 
		for (aux = 0; aux < numJugadores-1; aux++){ 
			cadena.append(jugadores[aux] + "\n");
		}
		return cadena.toString(); 	
		}
		
		public String imprimeValoreJugadores() {
			StringBuilder cadena = new StringBuilder();
			int aux; 
			for (aux = 0; aux < numJugadores-1; aux++){ 
				cadena.append(jugadores[aux].Resumen() + "\n");
			}
			return cadena.toString();
		}
		
		public String getJugadorTurno() {
			StringBuilder cadena = new StringBuilder();
				cadena.append(jugadores[jugadorJuega].getSimbolo() + "\n");			
			return cadena.toString(); 
		}
	
		
		public int getMovimientoJugador() {
				int resul= (int) (Math.random() * jugadores[jugadorJuega].getVelocidad());
			return resul;
		}
		
		public void compruebaFinJuego() {
			int aux; 
			for (aux = 0; aux < numJugadores-1; aux++){ 
			if (jugadores.length ==1) {
				isTerminado();}	
			else if (jugadores[aux].getDinero()==Constante.NUM_DINERO) {
				isTerminado();
			}
		
		}
		}
		
		private void eliminarJugador(Jugador j) {
			int aux;
			boolean salir=true;
			for (aux =0; aux<numJugadores-1 && salir; aux++){
		        if (jugadores[aux]==j) {
		        	jugadores[aux]=null;
		        	salir=false;
		        };		
		}
		}
		
		public void proximoJugador() {
			do {
				if (jugadorJuega==numJugadores-1) {
				jugadorJuega=0; 
				}
				else {
					jugadorJuega++;
				}
			}
			while(jugadores[jugadorJuega]==null);
		}
		
		private void irAPosicion (int x, int y) {
			Jugador j= jugadores[jugadorJuega];
			tablero[j.getFil()][j.getCol()]=null; 
			j.setFil(x); 
			j.setCol(y);
			tablero[x][y]=j; 
		}
		
	   private String encuentraArbol(Jugador j, int x, int y) {
		   String cadena; 
		   int magiaArbol = (int) (Math.random() * Constante.MAGIA_ARBOL);
		   int magiaJugador= (int) (Math.random() * j.getMagia());
		   if (magiaArbol<magiaJugador) {
			   irAPosicion(x,y); 
			   cadena= "Te has situado donde estaba el árbol";
		   }
		   else {
			   cadena= "No has podido moverte hacia el árbol";
			   
		   }
		   return cadena; 
	   }
	   
	   private String encuentraRoca (Jugador j, int x, int y) {
		   String cadena;
		   if (j.getGemas()>=1) {
			   irAPosicion(x,y); 
			   cadena= "Te has situado donde estaba la roca";
			   j.setGemas(j.getGemas()-1);
		   }
		   else {
			   cadena= "No has podido moverte hacia la roca";
		   }
		   return cadena; 
	   }
	   
	   private String lucha (Jugador j1, Jugador j2) {
		   String cadena; 
		   int fuerzaJugador1= (int) (Math.random() * j1.getFuerza());
		   int fuerzaJugador2= (int) (Math.random() * j2.getFuerza());
		   if (fuerzaJugador1>fuerzaJugador2 && j2.getPociones()==0) {
			   eliminarJugador(j2); 
			   cadena= "Has vencido al rival";
		   }
		   else if (fuerzaJugador1>fuerzaJugador2 && j2.getPociones()>=1) {
			   j2.setPociones(j2.getPociones()-1);
			   cadena= "Has vencido al rival";
		   }
		   else if (fuerzaJugador1<fuerzaJugador2 && j1.getPociones()>=1) {
			   j1.setPociones(j1.getPociones()-1);
			   cadena= "No has vencido al rival";
		   }		   
		   else {
			   eliminarJugador(j1);
			   cadena= "No has vencido al rival";
		   }
		   return cadena; 
	   }
	
	}