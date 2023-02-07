package Figuras;

public class Rectangulo extends Figura {
	
	protected double ancho;
	protected double alto;
	
	public Rectangulo (int x, int y, Double ancho, Double alto) {
		super(x,y);
		this.ancho=ancho;
		this.alto=alto;
	}
		public double area () {
			return ancho*alto;
		}
	}