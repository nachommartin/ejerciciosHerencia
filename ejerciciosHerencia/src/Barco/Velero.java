package Barco;

public class Velero extends Barco{
private int mastiles;

public Velero(String matricula, double eslora, int fabricacionAno, int mastiles) {
super(matricula, eslora, fabricacionAno);
this.mastiles=mastiles;
// TODO Auto-generated constructor stub
}

public int getMastiles() {
return mastiles;
}

@Override
public String toString() {
return "Velero " + super.toString() + "";
}

@Override
public double precioBarco() {
// TODO Auto-generated method stub
double aux = super.getEslora() *10 + this.mastiles;
return aux;
}




}

