package Herencia.Ej1;

public class Cuadrado extends Figura {
	public Cuadrado(double tamano) {
		super(tamano, tamano);
	}

	@Override
	public double getArea() {
		return super.getAltura() * super.getAltura();
	}

	@Override
	public double getPerimetro() {
		return super.getAltura() * 4;
	}
}
