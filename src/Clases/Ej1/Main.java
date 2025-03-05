package Clases.Ej1;

/*
 * Capitulo 9 - Ejercicio 1
 * Crear una clase "Persona" con sus atributos nombre, edad y genero. Definir un constructor que permita inicializar estos atributos al crear un objeto. Implementar un metodo para imprimir la informacion de la persona.
 */

class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.printInfo();
        Persona p2 = new Persona("Javier", 20, "Hombre");
        p2.printInfo();
    }
}
