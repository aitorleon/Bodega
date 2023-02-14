package Bodega;

import java.util.ArrayList;

public class faktura implements fakturazioa {
	private int zenbakia;
	private String izena;
	private String abizena;
	private ArrayList<fakturaLerroak> fak;
	private double totala;
	
	public faktura () {
		this.zenbakia=0;
		this.izena="";
		this.abizena="";
		this.fak = new ArrayList<fakturaLerroak>();
		this.totala=0;
	}
	public faktura (int z, String i, String a, double t) {
		this.zenbakia=z;
		this.izena=i;
		this.abizena=a;
		this.fak= new ArrayList <fakturaLerroak>();
		this.totala=t;
	}
	
	public void lerroaGehitu (String pkodea,int pkopurua,double pguztira) {
		fakturaLerroak f1 = new fakturaLerroak(pkodea, pkopurua,pguztira);
		fak.add(f1);
	} 
	
	public void print () {
		System.out.println("Faktura zenbakia" + this.zenbakia);
		System.out.println("Bezeroaren izena" + this.izena);
		System.out.println("Bezeroaren abizena" + this.abizena);
		for (fakturaLerroak y : fak) {
			System.out.println(y);
		}
		System.out.println("Totala" + kalkulatuTotala());
	}

	@Override
	public double kalkulatuTotala() {
		// TODO Auto-generated method stub
		double prezioFinal=0;
		for (fakturaLerroak w : fak) {
			prezioFinal = prezioFinal + w.getGuztiraLerro();
		}
		prezioFinal = prezioFinal * BEZ;
		return prezioFinal;
	}
	
	public int getZenbakia() {
		return zenbakia;
	}
	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
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
	public ArrayList<fakturaLerroak> getFak() {
		return fak;
	}
	public void setFak(ArrayList<fakturaLerroak> fak) {
		this.fak = fak;
	}
	public double getTotala() {
		return totala;
	}
	public void setTotala(double totala) {
		this.totala = totala;
	}
}
