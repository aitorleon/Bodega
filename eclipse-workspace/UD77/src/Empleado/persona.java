package Empleado;

import java.util.Objects;
import java.util.Scanner;

public class persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private Fecha fechanacimiento;
	
	public persona() {
		this.dni="";
		this.nombre="";
		this.apellidos="";
		this.fechanacimiento=new Fecha();
	}
	public persona(String dni, String n, String ap, Fecha fn) {
		this.dni=dni;
		this.nombre=n;
		this.apellidos=ap;
		this.fechanacimiento=fn;
	}
	public persona(persona p) {
		this.dni=p.dni;
		this.nombre=p.nombre;
		this.apellidos=p.apellidos;
		this.fechanacimiento=new Fecha(p.fechanacimiento);
	}
	public void leer(Scanner teklatua) {
		System.out.println("DNI:");
		this.dni=teklatua.next();
		System.out.println("Izena:");
		this.nombre=teklatua.next();
		System.out.println("Abizena");
		this.apellidos=teklatua.next();
		System.out.println("Jaiotze Data:");
		this.fechanacimiento.leer(teklatua);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	@Override
	public String toString() {
		return "persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechanacimiento=" + fechanacimiento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persona other = (persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechanacimiento == null) {
			if (other.fechanacimiento != null)
				return false;
		} else if (!fechanacimiento.equals(other.fechanacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
}
