package Bodega;
import java.util.ArrayList;
import java.util.Scanner;
public class bodegaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		artikuloZerrenda a1 = new artikuloZerrenda();
		artikuloZerrenda a2;
		Scanner teklatua = new Scanner(System.in);
		int aukera;
		String erantzuna="";
		a1.fillData();
		
		do {
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
				faktura f1 = new faktura();
				String end="",izena,abiz,pKodea="hasi";
				int pKopurua,fzk;
				double guz=0;
				System.out.println("Faktura zkia");
				fzk = teklatua.nextInt();
				f1.setZenbakia(fzk);
				System.out.println("Bezeroaren izena");
				izena = teklatua.next();
				f1.setIzena(izena);
				System.out.println("Bezeroaren abizena");
				abiz = teklatua.next();
				f1.setAbizena(abiz);
				do {
					System.out.println("Idatzi ezazu produktu kode, kopurua eta sakatu ENTER: (adibidez: 4855->12)");
					System.out.println("Produktuak sartzen amaitzeko idatzi END.");
					pKodea=teklatua.next();
					if (!pKodea.equalsIgnoreCase("end")) {
						System.out.println("Idatzi nahi duzun kantitatea");
						pKopurua=teklatua.nextInt();
						f1.lerroaGehitu(pKodea, pKopurua, a1.salneurria(pKodea)*pKopurua);
					}
				}while(!pKodea.equalsIgnoreCase("end"));
				f1.print();
				break;
			case 2:
				for (int i=0;i<a1.getLista().size();i++) {
						a1.getLista().get(i).printEzaugarriak();
				}
				break;
			case 3:
				for (int i=0;i<a1.getLista().size();i++) {
					if (a1.getLista().get(i).osasungarria()) {
						a1.getLista().get(i).printEzaugarriak();
					}
				}
				break;
			case 4:
				ArrayList <artikuloa> a = new ArrayList <artikuloa>();
				String kod;
				System.out.println("Sar ezazu kodea:");
				kod = teklatua.next();
				a=a1.ekibalentea(kod);
				for (int i=0;i<a.size();i++) {
					a.get(i).printEzaugarriak();
				}
				break;
			case 5:
				ArrayList <artikuloa> b = new ArrayList <artikuloa>();
				b=a1.garestiena();
				for (int i=0;i<b.size();i++) {
					b.get(i).printEzaugarriak();
				}
				break;
			case 6:
				ArrayList <artikuloa> c = new ArrayList <artikuloa>();
				c=a1.reponer();
				for (int i=0;i<c.size();i++) {
					c.get(i).printEzaugarriak();
				}
				break;
			case 7:
				int i=0,stock;
				boolean aurkituta = false;
				String kodea;
				System.out.println("Sartu kode bat");
				kodea = teklatua.next();
				System.out.println("Zenbat stock gehitu nahi duzu?");
				stock = teklatua.nextInt();
				while (!aurkituta && i<a1.getLista().size()) {
					if (a1.getLista().get(i).getKodea().equalsIgnoreCase(kodea)) {
						a1.getLista().get(i).GehituStock(stock);
						aurkituta = true;
					}else {
						i++;
					}
				}
				for (int j=0;j<a1.getLista().size();j++) {
					a1.getLista().get(j).printEzaugarriak();
				}
			}
			System.out.println("Programan jarraitu nahi duzu?");
			erantzuna = teklatua.next();
		}while(!erantzuna.equalsIgnoreCase("ez"));
	}

}
