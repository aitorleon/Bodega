package Bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class artikuloZerrenda {
	Scanner teklatua = new Scanner (System.in);
	ArrayList <artikuloa> lista;
	
	public artikuloZerrenda () {
		this.lista = new ArrayList<artikuloa>();
	}
	
	
	
	public void fillData () {
		artikuloa f1 = new freskagarriak("9845","CocaCola","CocaCola",0.70,300,"Cola",false,true,27);
		artikuloa f2 = new freskagarriak("8138","Kas Naranja","PepsiCola",0.50,178,"Naranja",true, true, 27);
		artikuloa f3 = new freskagarriak("6521","Nestea","Nestle",0.80,32,"Limoi Tea", true, false, 48);
		artikuloa f4 = new freskagarriak("9873","Fanta","CocaCola",0.80,59,"Limoia",true,false,28);
		artikuloa f5 = new freskagarriak("1894","Sprite","CocaCola",0.80,214,"Lima",true, true,27);
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		artikuloa a1 = new ardoa("1825","Setien","Catena",1.89,256,"Tintoa","Argentina",2014,"Garnacha");
		artikuloa a2 = new ardoa("4835","Otoñal","Torres",7.69,125,"Tintoa","Errioxa",2000,"BOBAL");
		artikuloa a3 = new ardoa("4875","Cumbrero","19 Crimes",5.65,300,"Tintoa","Australia",2010,"ALEKSANDROULI");
		artikuloa a4 = new ardoa("4835","Txakoli","Bodega Mendraka",8.99,72,"Txuria","Euskal Herria",2022,"Albariño");
		artikuloa a5 = new ardoa("4875","Viura","Rueda",4.55,48,"Txuria","Errioxa",1999,"Verdejo");
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
	}
	public ArrayList<artikuloa> reponer() {
		ArrayList <artikuloa> stockGutxi = new ArrayList<artikuloa>();
		for (artikuloa y : lista) {
			if (y.getStock()<50) {
				stockGutxi.add(y);
			}
		}
		return stockGutxi;
	}
	public ArrayList<artikuloa> garestiena() {
		double max = 0;
		ArrayList <artikuloa> garestiena = new ArrayList<artikuloa>();
		for (artikuloa w : lista) {
			if (max<w.getSalneurria()) {
				max=w.getSalneurria();
			}
		}
		for (artikuloa i : lista) {
			if (i.getSalneurria()==max) {
				garestiena.add(i);
			}
		}
		return garestiena;
	}
	public ArrayList<artikuloa> ekibalentea (String kodea) {
		ArrayList <artikuloa> berdina = new ArrayList<artikuloa>();
		double sal=salneurria(kodea);
		for (artikuloa i : lista) {
			if (i.getSalneurria()==sal) {
				berdina.add(i);
			}
		}
		return berdina;
	}
	public double salneurria (String pkodea) {
		double prezioa = 0;
		for (artikuloa i : lista) {
			if (i.getKodea().equals(pkodea)) {
				prezioa = i.getSalneurria();
			}
		}
		return prezioa;
	}
	public Scanner getTeklatua() {
		return teklatua;
	}
	public void setTeklatua(Scanner teklatua) {
		this.teklatua = teklatua;
	}
	public ArrayList<artikuloa> getLista() {
		return lista;
	}
	public void setLista(ArrayList<artikuloa> lista) {
		this.lista = lista;
	}
}