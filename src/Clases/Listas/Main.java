package Clases.Listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {

	public static int sumar(List<Integer> list) {
		// Ejercicio 1
		int res = 0;
		for (int v : list) {
			res += v;
		}
		return res;
	}

	public static int maxNum(List<Integer> list) {
		// Ejercicio 2
		int res = -1;
		for (int v : list) {
			if (v > res) {
				res = v;
			}
		}
		return res;
	}

	public static int contarPares(List<Integer> list) {
		// Ejercicio 3
		int res = 0;
		for (int v : list) {
			if (v % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	public static void longitud(List<String> list) {
		// Ejercicio 4
		for (String v : list) {
			System.out.printf("\"%s\": %s letras.\n", v, v.length());
		}
	}

	public static List<String> invertir(List<String> list) {
		// Ejercicio 6
		int j = list.size() - 1;
		for (int i = 0; i < j; i++) {
			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			j--;
		}
		return list;
	}

	public static List<String> quitarDuplicados(List<String> list) {
		// Ejercicio 8
		for (int i = 0; i < list.size(); i++) {
			String palabra = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if (palabra == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
		return list;
	}

	public static void printMayores(List<Persona> list, final int MAX_EDAD) {
		// Ejercicio 9
		for (Persona v : list) {
			if (v.getEdad() > MAX_EDAD) {
				v.printInfo();
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> listaInt = new ArrayList<>();
		List<String> listaString = new ArrayList<>();
		List<Persona> listaPersona = new ArrayList<>();
		// ListaInt
		listaInt.add(30);
		listaInt.add(5);
		listaInt.add(10);
		// ListaString
		listaString.add("Pera");
		listaString.add("Manzana");
		listaString.add("Banana");
		listaString.add("Naranja");
		listaString.add("Banana");
		// ListaPersona
		listaPersona.add(new Persona("Javier", 15));
		listaPersona.add(new Persona("Pedro", 40));
		listaPersona.add(new Persona("Luis", 60));
		listaPersona.add(new Persona("Juan", 25));
		listaPersona.add(new Persona("Mateo", 10));
		// Ejercicios
		System.out.printf("Suma: %s\n", sumar(listaInt)); // Ejercicio 1
		System.out.printf("Maximo numero: %s\n", maxNum(listaInt)); // Ejercicio 2
		System.out.printf("Numeros pares: %s\n", contarPares(listaInt)); // Ejercicio 3
		longitud(listaString); // Ejercicio 4
		System.out.printf("Ubicacion de \"Banana\": %s\n", listaString.indexOf("Banana")); // Ejercicio 5
		listaString = invertir(listaString); // Ejercicio 6
		quitarDuplicados(listaString); // Ejercicio 7
		listaInt.sort(Comparator.reverseOrder()); // Ejercicio 8
		printMayores(listaPersona, 30); // Ejercicio 9
		listaPersona.sort(Comparator.comparing(Persona::getEdad)); // Ejercicio 10, ordenados por su edad.
	}
}