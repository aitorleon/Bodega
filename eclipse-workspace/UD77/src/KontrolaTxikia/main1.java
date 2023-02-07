package KontrolaTxikia;

import java.util.Scanner;

public abstract class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		fruta a[] = new fruta[3];
		double max = 0;
		int pos = 0;
		for (int i = 0; i < 3; i++) {
			fruta f1 = new fruta();
			f1.irakurri(teklatua);
			a[i] = f1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].getKiloak() > max) {
				max = a[i].getKiloak();
				pos = i;
			}
		}
		a[pos].pantailaratu();
	}
}
