package Herencia.Ej2;

public abstract class Empleado {
	private String nombre;
	private int DNI;
	private int horas_trabajadas;
	private int valor;

	public Empleado(String nombre, int DNI, int horas_trabajadas, int valor) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.horas_trabajadas = horas_trabajadas;
		this.valor = valor;
	}

	public Empleado() {
		this.nombre = "";
		this.DNI = 0;
		this.horas_trabajadas = 0;
		this.valor = 0;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getDNI() {
		return this.DNI;
	}

	public int getHorasTrabajadas() {
		return this.horas_trabajadas;
	}

	public int getValor() {
		return this.valor;
	}

	public int getSueldo() {
		return this.valor * this.horas_trabajadas;
	}

	public void printInfo() {
		System.out.printf("%s : %s%nSueldo: %s%nHoras: %s%nA cobrar: %s%n", this.nombre, this.DNI,
				this.valor, this.horas_trabajadas, this.getSueldo());
	}

}
