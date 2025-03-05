package Herencia.Ej1;

public abstract class Figura {
	private double base;
	private double altura;

	public Figura(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return this.base;
	}

	public double getAltura() {
		return this.altura;
	}

	public abstract double getArea();

	public abstract double getPerimetro();
}
