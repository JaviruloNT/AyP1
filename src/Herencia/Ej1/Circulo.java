package Herencia.Ej1;

public class Circulo extends Figura {
	public Circulo(double tamano) {
		super(tamano, tamano);
	}

	@Override
	public double getArea() {
		return Math.PI * super.getAltura() * super.getAltura();
	}

	@Override
	public double getPerimetro() {
		return Math.PI * super.getAltura() * 2;
	}
}
