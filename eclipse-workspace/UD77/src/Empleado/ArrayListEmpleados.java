package Empleado;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEmpleados extends empleado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner(System.in);
		ArrayList<empleado>a = new ArrayList<empleado>();
		
		String erantzuna="";
		do {
			empleado e1 = new empleado();
			e1.irakurri(teklatua);
			a.add(e1);
			System.out.println("Datuak eskatzeaz jarraitu nahi duzu?");
			erantzuna=teklatua.next();
		}while (erantzuna.equals("bai"));
		for (empleado y:a) {
			System.out.println(y);
		}
	}
}
