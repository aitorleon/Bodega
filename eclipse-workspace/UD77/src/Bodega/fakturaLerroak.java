package Bodega;

public class fakturaLerroak {
	private String kodea;
	private int kopurua;
	private double guztiraLerro;
	
	public fakturaLerroak () {
		this.kodea="";
		this.kopurua=0;
		this.guztiraLerro=0;
	}
	public fakturaLerroak (String k, int ko, double g) {
		this.kodea=k;
		this.kopurua=ko;
		this.guztiraLerro=g;
	}
	public String getKodea() {
		return kodea;
	}
	public void setKodea(String kodea) {
		this.kodea = kodea;
	}
	public int getKopurua() {
		return kopurua;
	}
	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}
	public double getGuztiraLerro() {
		return guztiraLerro;
	}
	public void setGuztiraLerro(double guztiraLerro) {
		this.guztiraLerro = guztiraLerro;
	}
}
