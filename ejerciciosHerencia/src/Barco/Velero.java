package Barco;

public class Velero extends Barco {
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
	return "Velero [mastiles=" + mastiles + ", toString()=" + super.toString() + "]";
}



}
