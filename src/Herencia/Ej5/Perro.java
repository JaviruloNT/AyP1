package Herencia.Ej5;

public class Perro extends Animal {
	public Perro(String nombre) {
		super(nombre, "Perro");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo en alerta!");
	}

	@Override
	public void ruido() {
		System.out.println("Guau guau!");
	}
}
