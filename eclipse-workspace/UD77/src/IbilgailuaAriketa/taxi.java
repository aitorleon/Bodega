package IbilgailuaAriketa;
import java.util.Scanner;
public class taxi extends ibilgailua {
	private int LizentziaZenbakia;
	public taxi() {
		super();
		this.LizentziaZenbakia=0;
	}
	public taxi (int l, String m, String mo, int p, int pl, String [] k) {
		super(m,mo,p,pl,k);
		this.LizentziaZenbakia=l;
	}
	public taxi (taxi t) {
		super();
		this.LizentziaZenbakia=t.LizentziaZenbakia;
	}
	public void irakurri(Scanner teklatua) {
		super.irakurri(teklatua);
		System.out.println("Lizentzia Zenbakia");
		this.LizentziaZenbakia=teklatua.nextInt();
	}
	public void pantailaratu() {
		super.pantailaratu();
		System.out.println(this.LizentziaZenbakia);
	}
	public int getLizentziaZenbakia() {
		return LizentziaZenbakia;
	}
	public void setLizentziaZenbakia(int lizentziaZenbakia) {
		LizentziaZenbakia = lizentziaZenbakia;
	}
	
}
