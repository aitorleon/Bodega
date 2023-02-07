package Empleado;
import java.util.Scanner;
import java.util.Objects;

public class Fecha implements Comparable<Fecha> {
	int eguna,hilabetea,urtea;
	
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha () {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 2020;
	}
	
	public Fecha (int dia, int mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	
	public Fecha (Fecha f) {
		this.dia=f.dia;
		this.mes=f.mes;
		this.anyo=f.anyo;
	}
	
	public void leer (Scanner teklatua) {
		System.out.println("Idatzi eguna");
		eguna = teklatua.nextInt();
		System.out.println("Idatzi hilabetearen zenbakia");
		hilabetea = teklatua.nextInt();
		while (hilabetea>12) {
			System.out.println("Error, saiatu berriro idazten");
			hilabetea = teklatua.nextInt();
		}
		System.out.println("Idatzi urtearen zenbakia");
		urtea=teklatua.nextInt();
		System.out.println(eguna + "/" + hilabetea + "/" + urtea);
		this.dia=eguna;
		this.mes=hilabetea;
		this.anyo=urtea;
	}
	
	public int compareTo(Fecha other) {
		if (this.anyo>other.anyo) {
			return (1);
		}
		else if (this.anyo<other.anyo) {
			return (-1);
		}
		else {
			if (this.mes>other.mes) {
				return(1);
			}
			else if (this.mes<other.mes) {
				return (-1);
			}
			else {
				if (this.dia>other.dia) {
					return (1);
				}
				else if (this.dia<other.dia) {
					return (-1);
				}
			}
		}
		return 0;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(anyo, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anyo == other.anyo && dia == other.dia && mes == other.mes;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + "]";
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
