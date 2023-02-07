package IbilgailuaAriketa;
import java.util.Scanner;
public abstract class ibilgailua {
	private String matrikula;
	private String modelo;
	private int potentzia;
	private int plazakop;
	private String [] kolorea = new String [3];
	
	public ibilgailua() {
		this.matrikula="";
		this.modelo="";
		this.potentzia=0;
		this.plazakop=0;
		this.kolorea[0]="Zuria";
		this.kolorea[1]="Beltza";
		this.kolorea[2]="Urdina";
	}
	public ibilgailua (ibilgailua i) {
		this.matrikula=i.matrikula;
		this.modelo=i.modelo;
		this.potentzia=i.potentzia;
		this.plazakop=i.plazakop;
		this.kolorea=i.kolorea;
	}
	public ibilgailua (String m, String mo, int p, int pl, String [] k ) {
		this.matrikula=m;
		this.modelo=mo;
		this.potentzia=p;
		this.plazakop=pl;
		this.kolorea=k;
	}
	public String getMatrikula() {
		return matrikula;
	}
	public void setMatrikula(String matrikula) {
		this.matrikula = matrikula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotentzia() {
		return potentzia;
	}
	public void setPotentzia(int potentzia) {
		this.potentzia = potentzia;
	}
	public int getPlazakop() {
		return plazakop;
	}
	public void setPlazakop(int plazakop) {
		this.plazakop = plazakop;
	}
	public String[] getKolorea() {
		return kolorea;
	}
	public void setKolorea(String[] kolorea) {
		this.kolorea = kolorea;
	}
	public void irakurri (Scanner teklatua) {
		System.out.println("Matrikula");
		this.matrikula=teklatua.next();
		System.out.println("Modeloa");
		this.modelo=teklatua.next();
		System.out.println("Potentzia");
		this.potentzia=teklatua.nextInt();
		System.out.println("Plaza Kopurua");
		this.plazakop=teklatua.nextInt();
		for (int i=0;i<kolorea.length;i++) {
			System.out.println(this.kolorea[i]);
		}
	}
	public void pantailaratu () {
		System.out.println(this.matrikula);
		System.out.println(this.modelo);
		System.out.println(this.potentzia);
		System.out.println(this.plazakop);
		System.out.println();
	}
}
