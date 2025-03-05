package Herencia.Ej4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			String palabra;
			//
			while (true) {
				System.out
						.println(
								"Escriba una palabra a agregar. Si desea terminar el ingreso, ingrese un espacio vacio: ");
				palabra = sc.nextLine();
				if (palabra == "") {
					break;
				}
				lista.add(palabra);
			}
		}
		System.out.println(lista);
		lista.sort(Comparator.naturalOrder());
		System.out.println(lista);
		lista.sort(Comparator.reverseOrder());
		System.out.println(lista);
		lista.sort(Comparator.comparing(String::length));
		System.out.println(lista);
	}
}
