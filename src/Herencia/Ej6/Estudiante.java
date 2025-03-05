package Herencia.Ej6;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int anoIngreso;
	private double promedio;

	public Estudiante(String nombre, String apellido, int anoIngreso, double promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.anoIngreso = anoIngreso;
		this.promedio = promedio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getAnoIngreso() {
		return this.anoIngreso;
	}

	public double getPromedio() {
		return this.promedio;
	}

	public void info() {
		System.out.printf("[ '%s', '%s', %s, %s ]\n", this.nombre, this.apellido, this.anoIngreso, this.promedio);
	}
}
