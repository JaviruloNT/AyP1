package Herencia.Ej2;

public class Tecnico extends Empleado {

	public Tecnico(String nombre, int DNI, int horas_trabajadas) {
		super(nombre, DNI, horas_trabajadas, 6000);
	}

	public Tecnico(String nombre, int DNI) {
		super(nombre, DNI, 0, 6000);
	}
}
