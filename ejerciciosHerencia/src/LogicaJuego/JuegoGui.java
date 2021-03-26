package LogicaJuego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class JuegoGui extends Juego {
	private JButton[][] botones;
	private JFrame ventana;
	private JPanel panelSuperior;
	private JPanel panelJuego;
	private JLabel informacion;
	private int dado; 
	
	public JuegoGui (int numJugadores, char j1, char j2, char j3, char j4, char j5, char j6) throws JuegoException {
		super(numJugadores);
		if (j1 != 'x') super.crearJugador(j1);
		if (j1 != 'x') super.crearJugador(j2);
		if (j1 != 'x') super.crearJugador(j3);
		if (j1 != 'x') super.crearJugador(j4);
		if (j1 != 'x') super.crearJugador(j5);
		if (j1 != 'x') super.crearJugador(j6);
		
		// Crear ventana
		ventana = new JFrame ("jaca juego");
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.setPreferredSize(new Dimension(200,800));
		
		//Crear panel superior
		panelSuperior= new JPanel(); 
		panelSuperior.setBackground(Color.blue); 
		panelSuperior.setPreferredSize(new Dimension(200,350));
		informacion = new JLabel("");
		informacion.setForeground(Color.white);
		panelSuperior.add(informacion);
		ventana.add(panelSuperior, BorderLayout.NORTH);
		
		// Crea panel de botones
		
		panelJuego= new JPanel();
		botones = new JButton[super.alto][super.ancho]; 
		
		panelJuego.setLayout(new GridLayout(super.alto, super.ancho));
		// Crear botones
		Dimension d = new Dimension(50,50); 
		
		for (int i=0; i < super.alto; i++) {
			for (int j=0; j < super.ancho; j++) {
				JButton boton = new JButton(); 
				boton.setPreferredSize(d);
				this.asignarIcono(boton,i,j);
				panelJuego.add(boton);
				botones [i][j]=boton; 
			}
		}

		
		// Pongo ventana visible
		ventana.pack(); 
		ventana.setVisible(true); 



	}
	public String getElemento (int x, int y) {
		if (this.tablero[x][y]!=null)
			return tablero[x][y].toString();
		else
			return ""; 
	}
	
	private void asignarIcono(JButton boton, int x, int y) {
		ImageIcon imagenIcon;
		switch (tablero[x][y]) {
		case "A": 
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/arbol.png");
			break; 
		case "D": 
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/dinero.png");
			break; 
		case "R":
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/roca.png");
			break; 
		case "G":
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/gema.png");
			break; 
		case "P":
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/pocion.png");
			break; 
		case "E":
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img" + getTipoJugador() + "X.png");
			break; 
		default: 
			imagenIcon = new ImageIcon(System.getProperty("use.dir")+"/src/img/nada.png"); 
		}
	}
}
