package ariketaLiburutegia;

import java.util.Scanner;

public class aldizkaria extends liburutegia{
	private int zenbakia;
	public aldizkaria () {
		super();
		this.zenbakia=0;
	}
	public aldizkaria (int z, int k, String i, int p) {
		super(k, i, p);
		this.zenbakia=k;
	}
	public aldizkaria (aldizkaria a) {
		super();
		this.zenbakia=a.zenbakia;
	}
	public void aldizSortu (Scanner teklatua) {
		super.leer(teklatua);
		System.out.println("Sartu zenbakia");
		this.zenbakia=teklatua.nextInt();
	}
	public int getZenbakia() {
		return zenbakia;
	}
	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}
	@Override
	public String toString() {
		return super.toString() + "aldizkaria [zenbakia=" + zenbakia + "]";
	}
}
