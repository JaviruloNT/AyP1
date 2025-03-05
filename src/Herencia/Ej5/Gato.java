package Herencia.Ej5;

public class Gato extends Animal {
	public Gato(String nombre) {
		super(nombre, "Gato");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo relajado...");
	}

	@Override
	public void ruido() {
		System.out.println("Miauuuuuuu.");
	}
}
