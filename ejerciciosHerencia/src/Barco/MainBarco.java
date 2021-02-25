package Barco;
import java.util.Scanner;
import java.time.LocalDate;

public class MainBarco {

public static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {
// TODO Auto-generated method stub
Velero v1= new Velero ("200",20.0,1987,23);
System.out.println(v1);
Alquiler a1 = new Alquiler ("Paco","30453510A", LocalDate.parse("2021-03-07"),3, v1);
System.out.println(a1);
System.out.println(a1.precioAlquiler());
}

}
