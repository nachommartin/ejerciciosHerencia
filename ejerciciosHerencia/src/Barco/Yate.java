package Barco;

public class Yate extends Barco {
private int camarotes;
private int potenciaCV;


public Yate(String matricula, double eslora, int fabricacionAno, int camarotes, int potenciaCV) {
super(matricula, eslora, fabricacionAno);
this.camarotes=camarotes;
this.potenciaCV=potenciaCV;
// TODO Auto-generated constructor stub
}


public int getCamarotes() {
return camarotes;
}


public int getPotenciaCV() {
return potenciaCV;
}


@Override
public String toString() {
return "Yate "  + super.toString() + "";
}


@Override
public double precioBarco() {
// TODO Auto-generated method stub
double aux = super.getEslora() *10 + this.potenciaCV + this.camarotes;
return aux;
}

}


