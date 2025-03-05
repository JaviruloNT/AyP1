package Herencia.Ej1;

public class Triangulo extends Figura {
	private double hipo;

	public Triangulo(double base, double altura) {
		super(base, altura);
		hipo = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
	}

	@Override
	public double getArea() {
		return (super.getBase() * super.getAltura()) / 2;
	}

	@Override
	public double getPerimetro() {
		return super.getBase() + super.getAltura() + hipo;
	}
}
