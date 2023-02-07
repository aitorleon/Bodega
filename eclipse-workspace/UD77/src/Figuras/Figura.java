package Figuras;

public abstract class Figura {
	protected int x;
	protected int y;
	
	public Figura () {
		this.x=0;
		this.y=0;
	}
	
	public Figura(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract double area();
}
