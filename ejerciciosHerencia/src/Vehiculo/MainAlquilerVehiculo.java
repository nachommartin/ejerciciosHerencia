package Vehiculo;
import java.util.Scanner;



public class MainAlquilerVehiculo {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws VehiculoException {
		// TODO Auto-generated method stub
		try {
		Microbus c1= new Microbus ("SE2020DM","media",23);
		System.out.println(c1);
		AlquilerVehiculo a1 = new AlquilerVehiculo (c1,23);
		System.out.println(a1.precioAlquiler()); }
		catch (VehiculoException ve) {
			System.out.println(ve.getMessage());
		} 

}
	}

