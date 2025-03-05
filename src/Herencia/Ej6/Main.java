package Herencia.Ej6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void print(List<Estudiante> lista) {
		for (Estudiante v : lista) {
			v.info();
		}
		System.out.println("-----");
	}

	public static void main(String[] args) {
		List<Estudiante> lista = new ArrayList<>();
		lista.add(new Estudiante("Rebecca", "Thomas", 2022, 7.8173));
		lista.add(new Estudiante("William", "Flowers", 2020, 3.6002));
		lista.add(new Estudiante("Mabel", "Saunders", 2020, 2.209));
		lista.add(new Estudiante("Corey", "Norman", 2022, 3.8573));
		lista.add(new Estudiante("Carl", "Burke", 2024, 6.849));
		lista.add(new Estudiante("Josie", "Maldonado", 2020, 9.8363));
		print(lista);
		lista.sort(Comparator.comparing(Estudiante::getNombre).thenComparing(Estudiante::getApellido));
		print(lista);
		lista.sort(Comparator.comparing(Estudiante::getPromedio).reversed());
		print(lista);
	}
}
