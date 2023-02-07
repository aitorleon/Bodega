package Figuras;

public class Triangulo extends Figura {
	protected double base;
	protected double altura;
	
	public Triangulo (int x, int y, double base, double altura) {
		super(x,y);
		this.base=base;
		this.altura=altura;
	}
	public double area () {
		return ((base*altura)/2);
	}
}
