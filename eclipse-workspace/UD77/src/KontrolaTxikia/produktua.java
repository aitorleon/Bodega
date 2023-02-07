package KontrolaTxikia;
import java.util.Scanner;
public abstract class produktua {
	protected int id;
	protected String izena;
	protected int stock;
	public produktua() {
		this.id=0;
		this.izena="";
		this.stock=0;
	}
	public produktua (int id, String iz, int s ) {
		this.id=id;
		this.izena=iz;
		this.stock=s;
	}
	public produktua (produktua p) {
		this.id=p.id;
		this.izena=p.izena;
		this.stock=p.stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public abstract void irakurri(Scanner teklatua);
}
