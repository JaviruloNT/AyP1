package Herencia.Ej2;

public class Gerente extends Empleado {

	public Gerente(String nombre, int DNI, int horas_trabajadas) {
		super(nombre, DNI, horas_trabajadas, 10000);
	}

	public Gerente(String nombre, int DNI) {
		super(nombre, DNI, 0, 10000);
	}
}
