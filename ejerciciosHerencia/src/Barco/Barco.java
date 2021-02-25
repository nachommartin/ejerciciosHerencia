package Barco;

public abstract class Barco {
private String matricula;
private double eslora;
private int fabricacionAno;


public Barco(String matricula, double eslora, int fabricacionAno) {
super();
this.matricula = matricula;
this.eslora = eslora;
this.fabricacionAno = fabricacionAno;
}


public String getMatricula() {
return matricula;
}


public double getEslora() {
return eslora;
}


public int getFabricacionAno() {
return fabricacionAno;
}


@Override
public String toString() {
return "con matricula " + matricula + ", " + eslora + " metros de eslora y fabricado en " + fabricacionAno + "";
}


@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
return result;
}


@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Barco other = (Barco) obj;
if (matricula == null) {
if (other.matricula != null)
return false;
} else if (!matricula.equals(other.matricula))
return false;
return true;
}

public abstract double precioBarco();


}
