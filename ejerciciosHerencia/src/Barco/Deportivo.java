package Barco;

public class Deportivo extends Barco {
private int potenciaCV;

public Deportivo(String matricula, double eslora, int fabricacionAno, int potenciaCV) {
	super(matricula, eslora, fabricacionAno);
	this.potenciaCV=potenciaCV;
	// TODO Auto-generated constructor stub
}

public int getPotenciaCV() {
	return potenciaCV;
}

@Override
public String toString() {
	return "Deportivo [potenciaCV=" + potenciaCV + ", toString()=" + super.toString() + "]";
}

}
