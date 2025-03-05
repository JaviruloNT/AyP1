package Clases.Listas;

public class Persona {
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}

	public void printInfo() {
		System.out.printf("%s : %s\n", this.nombre, this.edad);
	}
}
