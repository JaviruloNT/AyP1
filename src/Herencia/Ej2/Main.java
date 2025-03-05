package Herencia.Ej2;

public class Main {
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[2];
		empleados[0] = new Tecnico("Javier", 12345678);
		empleados[1] = new Gerente("Pedro", 87654321);

		for (Empleado v : empleados) {
			v.printInfo();
		}
	}
}
