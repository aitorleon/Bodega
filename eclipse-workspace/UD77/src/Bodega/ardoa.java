package Bodega;

public class ardoa extends artikuloa {
	private String kolorea;
	private String jatorria;
	private int urtea;
	private String mahatsa;
	
	public ardoa () {
		super();
		this.kolorea="";
		this.jatorria="";
		this.urtea=0;
		this.mahatsa="";
	}
	public ardoa (String k, String i, String m, double s, int st,String k1, String j, int u, String m1) {
		super(k,i,m,s,st);
		this.kolorea=k1;
		this.jatorria=j;
		this.urtea=u;
		this.mahatsa=m1;
	}
	@Override
	public void printEzaugarriak() {
		// TODO Auto-generated method stub
		System.out.println(this.kodea);
		System.out.println(this.Izena);
		System.out.println(this.marka);
		System.out.println(this.salneurria);
		System.out.println(this.stock);
		System.out.println(this.kolorea);
		System.out.println(this.jatorria);
		System.out.println(this.urtea);
		System.out.println(this.mahatsa);
	}
	@Override
	public boolean osasungarria() {
		// TODO Auto-generated method stub
		if (this.jatorria.equalsIgnoreCase("Errioxa")) {
			return true;
		}
		else {
			return false;
		}
	}
}
