package Bodega;
import java.util.ArrayList;
import java.util.Scanner;
public class bodegaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		artikuloZerrenda a1 = new artikuloZerrenda();
		ArrayList <artikuloZerrenda> produktuak = new ArrayList <artikuloZerrenda>();
		Scanner teklatua = new Scanner(System.in);
		int aukera;
		a1.fillData();
		
		System.out.println("...............................");
		System.out.println("SALMENTEN KUDEAKETA");
		System.out.println("...............................");
		System.out.println("1-Salmenta bat egin (faktura sortu)");
		System.out.println("2-Artikulo guztiak ikusi");
		System.out.println("3-Artikulo osasungarriak ikusi");
		System.out.println("4-Kode bat eskatu eta artikulo horren prezio ekibalentea duten artikulo zerrrenda.");
		System.out.println("5-Produktu garestienak ikusi");
		System.out.println("6-Stock gutxi duten produktuen zerrenda");
		System.out.println("7-Kodea sartu eta artikuloen stock-a gehitu");
		System.out.println("0-Amaitu");
		System.out.println("................");
		aukera = teklatua.nextInt();
		switch (aukera) {
		case 1:
			break;
		case 2:
			for (artikuloZerrenda i : produktuak) {
				System.out.println(i);
			}
			break;
		case 3:
			for (artikuloZerrenda w : produktuak) {
				
			}
		}
	}

}
