package Herencia.Ej1;

public class Main {
	public static void main(String[] args) {
		//
		Cuadrado cuadrado = new Cuadrado(5);
		Circulo circulo = new Circulo(5);
		Triangulo triangulo = new Triangulo(5, 5);
		//
		System.out.println(cuadrado.getArea());
		System.out.println(cuadrado.getPerimetro());
		System.out.println(circulo.getArea());
		System.out.println(circulo.getPerimetro());
		System.out.println(triangulo.getArea());
		System.out.println(triangulo.getPerimetro());
	}
}
