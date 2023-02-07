package Figuras;

public class Circulo extends Figura {
	protected double radio;
	
	public Circulo (int x, int y, double radio) {
		super(x,y);
		this.radio=radio;
	}
	public double area() {
		return Math.PI*radio*radio;
	}
}
