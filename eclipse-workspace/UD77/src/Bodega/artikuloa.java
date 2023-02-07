package Bodega;

public abstract class artikuloa {
	protected String kodea;
	protected String Izena;
	protected String marka;
	protected double salneurria;
	protected int stock;
	
	public artikuloa () {
		this.kodea="";
		this.Izena="";
		this.marka="";
		this.salneurria=0;
		this.stock=0;
	}
	public artikuloa (String k, String i, String m, double s, int st) {
		this.kodea=k;
		this.Izena=i;
		this.marka=m;
		this.salneurria=s;
		this.stock=st;
	}
	
	public void GehituStock (int num) {
		stock=this.stock+num;
	}
	public void KenduStock (int res) {
		stock = this.stock-res;
	}
	public abstract void printEzaugarriak();
	public abstract boolean osasungarria();
	public String getKodea() {
		return kodea;
	}
	public void setKodea(String kodea) {
		this.kodea = kodea;
	}
	public String getIzena() {
		return Izena;
	}
	public void setIzena(String izena) {
		Izena = izena;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public double getSalneurria() {
		return salneurria;
	}
	public void setSalneurria(double salneurria) {
		this.salneurria = salneurria;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
