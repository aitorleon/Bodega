package UD77;
import java.util.Scanner;
public class Ikaslea extends Pertsona {
	private Double nota;
	
	public Ikaslea() {
		super();
		this.nota=0.0;
	}
	
	public Ikaslea (String n, String i, String a, Double no) {
		super(n,i,a);
		this.nota=no;
	}
	
	public Ikaslea (Double no) {
		super();
		this.nota=no;
	}
	
	public void irakurri(Scanner teklatua) {
		super.irakurri(teklatua);
		System.out.println("Nota");
		this.nota=teklatua.nextDouble();
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Ikaslea [nota=" + nota + "]";
	}
	
	
}
