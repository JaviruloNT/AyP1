package Clases.Ej4;

/*
 * Capitulo 9 - Ejercicio 4
 * Crear clase "Libro" con titulo, autor y ano. Implementar metodos para mostrar info del libro. Probar con 2 objetos Libro y comprobar si son iguales.
 */
class Main {
    public static void printEqual(Libro a, Libro b) {
        System.out.printf("\"%s\" y \"%s\" ", a.getTitulo(), b.getTitulo());
        if (a == b || (a != null && a.equals(b))) {
            System.out.printf("son iguales.\n");
        } else {
            System.out.printf("son distintos.\n");
        }
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("Yo programo en Java", "Daniel Mallea", 2024);
        Libro l2 = new Libro("Yo programo en Java", "Daniel Mallea", 2024);
        Libro l3 = new Libro("Yo programo en Python", "Javier Andrade", 2025);
        printEqual(l1, l2); // No se pq no anda :(
        printEqual(l1, l3);
        printEqual(l2, l3);
    }
}
