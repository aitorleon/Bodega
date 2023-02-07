package Bodega;

import java.util.ArrayList;

public class faktura implements fakturazioa {
	private int zenbakia;
	private String izena;
	private String abizena;
	ArrayList <fakturaLerroak> fak = new ArrayList();
	private double totala;
	
	public faktura () {
		this.zenbakia=0;
		this.izena="";
		this.abizena="";
		this.totala=0;
	}
	public faktura (int z, String i, String a, double t) {
		this.zenbakia=z;
		this.izena=i;
		this.abizena=a;
		this.totala=t;
	}
	
	public void lerroaGehitu (String pkodea,int pkopurua,double pguztira) {
		
	}

	@Override
	public double kalkulatuTotala() {
		// TODO Auto-generated method stub
		return 0;
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
