package KontrolaTxikia;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner (System.in);
		
		ArrayList<fruta>b = new ArrayList<fruta>();
		int pos=0;
		
		for (int i=0;i<3;i++) {
			fruta f1 = new fruta();
			f1.irakurri(teklatua);
			b.add(f1);
		}
		for (int j=0;j<b.size();j++) {
			double min=b.get(j).getKiloak();
			if (b.get(j).getKiloak()<min) {
				min= b.get(j).getKiloak();
				pos=j;
			}
		}
		b.get(pos).getKiloak();
	}

}
