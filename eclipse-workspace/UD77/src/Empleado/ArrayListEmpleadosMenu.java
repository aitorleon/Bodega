package Empleado;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEmpleadosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		ArrayList<empleado> a = new ArrayList<empleado>();
		String be="";
		int aukera;
		do {
			System.out.println("ZER EGIN NAHI DUZU?");
			System.out.println("1.- Langilea gehitu");
			System.out.println("2.- Langilea Bilatu");
			System.out.println("3.- Langilea Borratu");
			System.out.println("4.- Langileak begiratu");
			System.out.println("5.- Irten");
			aukera = teklatua.nextInt();
		
		switch(aukera) {
		case 1:
			empleado langileBerria = new empleado();
			langileBerria.irakurri(teklatua);
			a.add(langileBerria);
			if (a.contains(langileBerria)) {
				System.out.println("ERROR");
			}
			break;
		case 2:
			empleado langileaBilatu = new empleado();
			langileaBilatu.irakurri(teklatua);
			if (a.contains(langileaBilatu)) {
				System.out.println(langileaBilatu + " " + a.indexOf(langileaBilatu) + " posizioan dago");
			}
			else {
				System.out.println("Langilea ez dago");
			}
			break;
		case 3:
			empleado langileaBorratu = new empleado();
			langileaBorratu.irakurri(teklatua);
			if (a.contains(langileaBorratu)) {
				a.remove(langileaBorratu);
				System.out.println("Langilea borratu da");
			}
			else {
				System.out.println("Langilea ez dago");
			}
			break;
		case 4:
			for (empleado i : a) {
				System.out.println(i);
			}
			break;
		case 5:
			System.out.println("Agur");
			System.exit(0);
		}
		System.out.println("Programan jarraitu nahi duzu?");
		be=teklatua.next();
		}while(be.equalsIgnoreCase("bai"));
	}
}
