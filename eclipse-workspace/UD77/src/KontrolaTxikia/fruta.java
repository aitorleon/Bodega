package KontrolaTxikia;
import java.util.Scanner;
public class fruta extends produktua{
	protected double kiloak;
	public fruta () {
		super();
		this.kiloak=0;
	}
	public fruta (int id, String i, int s, double k) {
		super(id,i,s);
		this.kiloak=k;
	}
	public fruta (fruta f) {
		super();
		this.kiloak=f.kiloak;
	}
	public double getKiloak() {
		return kiloak;
	}
	public void setKiloak(double kiloak) {
		this.kiloak = kiloak;
	}
	
	public void pantailaratu () {
		System.out.println(this.getId());
		System.out.println(this.getIzena());
		System.out.println(this.getStock());
		System.out.println(this.kiloak);
	}
	@Override
	public void irakurri(Scanner teklatua) {
		// TODO Auto-generated method stub
		System.out.println("Idatzi produktuaren ID-a");
		this.id=teklatua.nextInt();
		System.out.println("Idatzi frutaren izena");
		this.izena=teklatua.next();
		System.out.println("Zenbat stock dago?");
		this.stock=teklatua.nextInt();
		System.out.println("Zenbat pisatzen du?");
		this.kiloak=teklatua.nextDouble();
	}
}
