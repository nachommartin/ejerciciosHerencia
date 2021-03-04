package Vehiculo;
import java.util.Scanner;



public class MainAlquilerVehiculo {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws VehiculoException {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido");
		
		int opcion= leerEntero("Elija una opción:\n 1. Alta de vehículo\n 2. Alta de alquiler y cálculo del precio\n 3. Salir");
		Vehiculo[] listaVehiculo= new Vehiculo[200];
		int contador = 0;
		while (opcion!=3) {
		switch (opcion) {
		case 1: {
			String tipo= leerCadena("Qué tipo de vehículo:\n Coche\n Furgoneta\n Microbus");
			switch (tipo) {
			case "Coche": {
				String matricula= leerCadena("Añada la matricula");
				String gama = leerCadena("Añada la gama:\n alta\n media\n baja");
				String carburante= leerCadena("Qué tipo de carburante:\n gasolina\n diesel");
				listaVehiculo [contador] = new Coche (matricula, gama, carburante); 
				contador ++;
				break;}
			case "Furgoneta": {
				String matricula= leerCadena("Añada la matricula");
				String gama = leerCadena("Añada la gama:\n alta\n media\n baja");
				double PMO= leerDouble("Cuál es su pexo máximo permitido");
				listaVehiculo [contador] = new Furgoneta (matricula, gama, PMO); 
				contador ++;
				break;}
			case "Microbus": {
				String matricula= leerCadena("Añada la matricula");
				String gama = leerCadena("Añada la gama:\n alta\n media\n baja");
				int plazas =leerEntero("Cuántas plazas");
				listaVehiculo [contador] = new Microbus (matricula, gama, plazas); 
				contador ++;
				break;}
			}
			break;}
			
			case 2: {
				String matricula= leerCadena("Diga la matricula");
				int dias =leerEntero("Cuántos días");
				boolean encontrado = false;
				for (int i=0;  i < contador-1 && !encontrado; i ++) {
					if (listaVehiculo[i].getMatricula().equals(matricula)){
						Vehiculo vehiculo=listaVehiculo[i];
						AlquilerVehiculo a1 = new AlquilerVehiculo (vehiculo, dias);
						encontrado=true;
						System.out.println("El precion es " + a1.precioAlquiler() + " euros"); }
					else {
						System.out.println("Coche no encontrado");
			}}
				break;
			}}
			
		opcion= leerEntero("Elija una opción:\n 1. Alta de vehículo\n 2. Alta de alquiler y cálculo del precio\n 3. Salir");

		}
}
	
	
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		int aux= Integer.parseInt(teclado.nextLine());
		return aux;
	}
	
	public static double leerDouble(String msg) {
		System.out.println(msg);
		double aux= Double.parseDouble(teclado.nextLine());
		return aux;
	}
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	}

