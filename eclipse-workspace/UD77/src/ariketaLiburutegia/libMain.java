package ariketaLiburutegia;

import java.util.ArrayList;
import java.util.Scanner;

public class libMain {
	public static int PublicacionesAnterioresA (ArrayList <liburutegia> list, int urtea) {
		int i=0;
		for (liburutegia p: list) {
			if (p.getPublUrtea()<urtea) {
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner (System.in);
		ArrayList <liburutegia> a = new ArrayList ();
		ArrayList <liburua> b = new ArrayList ();
		liburua l1;
		liburua l2;
		liburua l3;
		aldizkaria a1;
		int urtea,kont=0;

		for (int i=0;i<2;i++) {
			l1 = new liburua();
			l1.LiburuaSortu(teklatua);
			a.add(l1);
			a1 = new aldizkaria();
			a1.aldizSortu(teklatua);
			a.add(a1);
		}
		
		for (liburutegia w : a) {
			System.out.println(w.toString());
		}
		
		System.out.println("Zer urte konprobatu nahi duzu?");
		urtea = teklatua.nextInt();
		System.out.println(PublicacionesAnterioresA(a, urtea));
		
		
		
		for (int i=0;i<2;i++) {
			l3 = new liburua();
			l3.LiburuaSortu(teklatua);
			b.add(l3);
		}
		System.out.println(b.size());
		for (liburua y:b) {
			if (y.mailegatua()) {
				kont++;
			}
		}
		System.out.println(kont + " Maileguan utzi dira");
	}

}
