package Bodega;

public class freskagarriak extends artikuloa {
	private String zaporea;
	private boolean zukua;
	private boolean gasa;
	private int azukrea;
	
	public freskagarriak () {
		super();
		this.zaporea="";
		this.zukua=false;
		this.gasa=false;
		this.azukrea=0;
	}
	public freskagarriak (String k, String i, String m, double s, int st,String z, boolean zu, boolean g, int a) {
		super(k,i,m,s,st);
		this.zaporea=z;
		this.zukua=zu;
		this.gasa=g;
		this.azukrea=a;
	}
	
	@Override
	public void printEzaugarriak() {
		// TODO Auto-generated method stub
		System.out.println(this.kodea);
		System.out.println(this.Izena);
		System.out.println(this.marka);
		System.out.println(this.salneurria);
		System.out.println(this.stock);
		System.out.println(this.zaporea);
		System.out.println(this.zukua);
		System.out.println(this.gasa);
		System.out.println(this.azukrea);
		System.out.println("----------------");
	}
	@Override
	public boolean osasungarria() {
		// TODO Auto-generated method stub
		if (this.azukrea<25) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getZaporea() {
		return zaporea;
	}
	public void setZaporea(String zaporea) {
		this.zaporea = zaporea;
	}
	public boolean isZukua() {
		return zukua;
	}
	public void setZukua(boolean zukua) {
		this.zukua = zukua;
	}
	public boolean isGasa() {
		return gasa;
	}
	public void setGasa(boolean gasa) {
		this.gasa = gasa;
	}
	public int getAzukrea() {
		return azukrea;
	}
	public void setAzukrea(int azukrea) {
		this.azukrea = azukrea;
	}
	@Override
	public String toString() {
		return "freskagarriak [zaporea=" + zaporea + ", zukua=" + zukua + ", gasa=" + gasa + ", azukrea=" + azukrea
				+ "]";
	}
}
