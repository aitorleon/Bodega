package Empleado;
import java.util.Scanner;
public class empleado extends persona {
	private String departamento;
	private String puesto;
	private double salario;
	public empleado() {
		super();
		this.departamento="";
		this.puesto="";
		this.salario=0.0;
	}
	public empleado(String d, String p, double s) {
		super();
		this.departamento=d;
		this.puesto=p;
		this.salario=s;
	}
	public empleado(String dni, String n, String ap, Fecha fn, String dep, String p, double s) {
		super(dni,n,ap,fn);
		this.departamento=dep;
		this.puesto=p;
		this.salario=s;
	}
	public empleado(empleado e) {
		super();
		this.departamento=e.departamento;
		this.puesto=e.puesto;
		this.salario=e.salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return super.toString()+"empleado [ + departamento=" + departamento + ", puesto=" + puesto + ", salario=" + salario + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		empleado other = (empleado) obj;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	public void irakurri (Scanner teklatua) {
		super.leer(teklatua);
		System.out.println("Idatzi departamentuaren izena");
		this.departamento=teklatua.next();
		System.out.println("Idatzi zer postutan zauden");
		this.puesto=teklatua.next();
		do {
			System.out.println("Idatzi zenbat kobraten duzun");
			this.salario=teklatua.nextDouble();
		}while(this.salario<0);
	}
}
