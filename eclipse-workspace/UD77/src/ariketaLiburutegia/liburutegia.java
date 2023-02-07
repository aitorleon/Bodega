package ariketaLiburutegia;

import java.util.Scanner;

public class liburutegia {
	private int kodea;
	private String izenburua;
	private int publUrtea;
	public liburutegia() {
		this.kodea=0;
		this.izenburua="";
		this.publUrtea=0;
	}
	public liburutegia (int k, String i, int p) {
		this.kodea=k;
		this.izenburua=i;
		this.publUrtea=0;
	}
	public liburutegia (liburutegia l) {
		this.kodea=l.kodea;
		this.izenburua=l.izenburua;
		this.publUrtea=l.publUrtea;
	}
	public void leer (Scanner teklatua) {
		System.out.println("Sartu kodea");
		this.kodea=teklatua.nextInt();
		System.out.println("Sartu izena");
		this.izenburua=teklatua.next();
		System.out.println("Sartu urtea");
		this.publUrtea=teklatua.nextInt();
	}
	@Override
	public String toString() {
		return "liburutegia [kodea=" + kodea + ", izenburua=" + izenburua + ", publUrtea=" + publUrtea + "]";
	}
	public int getKodea() {
		return kodea;
	}
	public void setKodea(int kodea) {
		this.kodea = kodea;
	}
	public String getIzenburua() {
		return izenburua;
	}
	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}
	public int getPublUrtea() {
		return publUrtea;
	}
	public void setPublUrtea(int publUrtea) {
		this.publUrtea = publUrtea;
	}
}
