package IbilgailuaAriketa;
import java.util.Scanner;
public class autobusa extends ibilgailua{
	private boolean eskolabai;
	private int ZutikPlazaKop;
	
	public autobusa () {
		this.eskolabai=false;
		this.ZutikPlazaKop=0;
	}
	public autobusa (String m, String mo, int p, int pl, String [] k, boolean es, int zu) {
		super(m,mo,p,pl,k);
		this.eskolabai=es;
		this.ZutikPlazaKop=zu;
	}
	public autobusa (autobusa a) {
		super();
		this.eskolabai=a.eskolabai;
		this.ZutikPlazaKop=a.ZutikPlazaKop;
	}
	public void irakurri(Scanner teklatua) {
		super.irakurri(teklatua);
		System.out.println("Eskolarako bada true idatzi");
		this.eskolabai=teklatua.nextBoolean();
		System.out.println("Zenbat pertsona joan ahal dira zutik?");
		this.ZutikPlazaKop=teklatua.nextInt();
	}
	public boolean isEskolabai() {
		return eskolabai;
	}
	public void setEskolabai(boolean eskolabai) {
		this.eskolabai = eskolabai;
	}
	public int getZutikPlazaKop() {
		return ZutikPlazaKop;
	}
	public void setZutikPlazaKop(int zutikPlazaKop) {
		ZutikPlazaKop = zutikPlazaKop;
	}
}
