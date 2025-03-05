package Clases.Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	static String traductor(HashMap<String, String> diccionario, String espanol) {
		// Ejercicio 1
		espanol = espanol.toLowerCase();
		if (!diccionario.containsKey(espanol)) {
			return null;
		}
		return diccionario.get(espanol);
	}

	static HashMap<String, Integer> contarPalabras(List<String> lista) {
		// Ejercicio 2
		HashMap<String, Integer> map = new HashMap<>();
		for (String v : lista) {
			if (!map.containsKey(v)) {
				map.put(v, 1);
			} else {
				map.replace(v, map.get(v) + 1);
			}
		}
		return map;
	}

	static HashMap<String, String> unirMapasUnicos(HashMap<String, String> a, HashMap<String, String> b) {
		for (String k : b.keySet()) {
			String v = b.get(k);
			a.put(k, v);
		}
		return a;
	}

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		HashMap<String, String> diccionario2 = new HashMap<>();
		List<String> lista = new ArrayList<>();
		// diccionario
		diccionario.put("computadora", "computer");
		diccionario.put("alumno", "student");
		diccionario.put("gato", "cat");
		diccionario.put("pinguino", "penguin");
		diccionario.put("maquina", "machine");
		diccionario.put("libro", "book");
		//
		diccionario2.put("maquina", "machine");
		diccionario2.put("naturaleza", "nature");
		diccionario2.put("luz", "light");
		diccionario2.put("verde", "green");
		diccionario2.put("libro", "book");
		diccionario2.put("piramide", "pyramid");
		// lista
		lista.add("Pera");
		lista.add("Manzana");
		lista.add("Banana");
		lista.add("Naranja");
		lista.add("Banana");
		// Ejercicios
		System.out.println(traductor(diccionario, "Computadora")); // Ejercicio 1
		System.out.println(contarPalabras(lista)); // Ejercicio 2
		diccionario.remove("computadora"); // Ejercicio 3
		System.out.println(unirMapasUnicos(diccionario, diccionario2)); // Ejercicio 4,5 y 6 (Un mapa no puede tener
																		// claves iguales pero si valores iguales, es
																		// solo usar el map.put)
	}
}
