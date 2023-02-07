package Empleado;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class ArrayListEmpleadoOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		ArrayList<empleado> a = new ArrayList<empleado>();
		
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
		
		/*if (a.isEmpty()) {
			System.out.println("Error, arraylist-a utzik dago");
		}
		else {
			Collections.sort(a);
		}*/
	}
}
