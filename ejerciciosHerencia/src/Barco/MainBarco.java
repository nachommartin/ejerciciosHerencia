package Barco;
import java.util.Scanner;
import java.time.LocalDate;

public class MainBarco {

public static Scanner teclado = new Scanner(System.in);

public static void main(String[] args)  throws Exception {
// TODO Auto-generated method stub
Velero v1= new Velero ("200",20.0,1987,23);
System.out.println(v1);
try {
Alquiler a1 = new Alquiler ("Paco","30453510A", LocalDate.parse("2020-03-07"),3, v1);
System.out.println(a1);
System.out.println(a1.precioAlquiler()); }
catch (AlquilerException ae) {
System.out.println(ae.getMessage());
}
}

}
