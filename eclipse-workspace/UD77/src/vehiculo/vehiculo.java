package vehiculo;

public abstract class vehiculo {
	protected String nombreVehiculo;
	protected int potenciaMotor;
	protected int velocidadMaxima;
	public vehiculo() {
		this.nombreVehiculo="";
		this.potenciaMotor=0;
		this.velocidadMaxima=0;
	}
	public vehiculo (String n) {
		this.nombreVehiculo=n;
	}
	public vehiculo (String nV, int pM, int vM) {
		this.nombreVehiculo=nV;
		this.potenciaMotor=pM;
		this.velocidadMaxima=vM;
	}
	public vehiculo (vehiculo v) {
		this.nombreVehiculo=v.nombreVehiculo;
		this.potenciaMotor=v.potenciaMotor;
		this.velocidadMaxima=v.velocidadMaxima;
	}
	public String getNombreVehiculo() {
		return nombreVehiculo;
	}
	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	@Override
	public String toString() {
		return "vehiculo [Nombre=" + nombreVehiculo + ", Potencia=" + potenciaMotor + ", CV Velocidad="
				+ velocidadMaxima + "Km/h]";
	}
	public abstract void iniciarDesplazamiento();
	public abstract void finalizarDesplazamiento();
}
