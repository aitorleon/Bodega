package UD77;
import java.util.ArrayList;
import java.util.Scanner;
public class FrogaMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner(System.in);
		/*ArrayList<Ikaslea>a = new ArrayList<Ikaslea>();*/
		Ikaslea a [] = new Ikaslea [3];
		
		/*Pertsona p1 = new Pertsona("11111111A", "Unai", "Nuñez");
		System.out.println(p1);
		Ikaslea i1 = new Ikaslea ("22222222B", "Laura", "Fernandez", 10.0);
		System.out.println(i1);
		
		
		i2.irakurri(teklatua);
		System.out.println(i2);*/
		
		//HECHO CON FOR (ARRAYLIST)
		
		/*for (int i=0;i<3;i++) {
			
			i2.irakurri(teklatua);
			a.add(i2);
		}
		
		for (Ikaslea e :a ) {
			System.out.println(e);
		}*/
		
		//HECHO CON FOR (ARRAY NORMAL)
		
		for (int i=0;i<a.length;i++) {
			Ikaslea i2 = new Ikaslea();
			i2.irakurri(teklatua);
			a[i]=i2;
		}
		
		for (int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}