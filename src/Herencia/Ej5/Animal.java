package Herencia.Ej5;

public abstract class Animal {
	private String nombre;
	private String tipo;

	public Animal(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	abstract void comer();

	abstract void ruido();

	public void info() {
		System.out.printf("%s : %s%n", this.nombre, this.tipo);
	}
}
