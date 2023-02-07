package UD77;
import java.util.Scanner;
public class Pertsona {

	private String nan;
	private String izena;
	private String abizena;
	
	public Pertsona() {
		this.nan="";
		this.izena="";
		this.abizena="";
	}
	
	public Pertsona(String n, String i, String a) {
		this.nan=n;
		this.izena=i;
		this.abizena=a;
	}
	
	public Pertsona (Pertsona p) {
		this.nan=p.nan;
		this.izena=p.izena;
		this.abizena=p.abizena;
	}
	
	public void irakurri (Scanner teklatua) {
		System.out.println("NAN");
		this.nan=teklatua.next();
		System.out.println("Izena");
		this.izena=teklatua.next();
		System.out.println("Abizena");
		this.abizena=teklatua.next();
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	@Override
	public String toString() {
		return "Pertsona [nan=" + nan + ", izena=" + izena + ", abizena=" + abizena + "]";
	}
	
	
}
