package Herencia.Ej5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> animales = new ArrayList<>();
		animales.add(new Gato("Oliver"));
		animales.add(new Gato("Nicolino"));
		animales.add(new Perro("Rufus"));
		animales.add(new Perro("Gaucho"));

		for (Animal v : animales) {
			v.info();
			v.ruido();
			v.comer();
		}
	}
}
