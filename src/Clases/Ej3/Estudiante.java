package Clases.Ej3;

/*
 * Capitulo 9 - Ejercicio 3
 * Crear una clase "Estudiante" con atributos como nombre y 5 calificaciones. Definor un constructor para inicializar el nombre y opcinalmente las 5 calificaciones. Implementar metodos para calcular el promedio de calificaciones, establecer las calificaciones y mostrar la informacion del estudiante.
 */
class Estudiante {
    private String nombre;
    private int[] notas = { -1, -1, -1, -1, -1 };

    // Build
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, int[] arrayNotas) {
        this.nombre = nombre;
        for (int i = 0; i < arrayNotas.length && i < 5; i++) {
            this.notas[i] = arrayNotas[i];
        }
        if (arrayNotas.length > 5) {
            System.out.println("La cantidad de notas es mayor al limite (5).");
        }
    }

    // Gets
    public String getNombre() {
        return this.nombre;
    }

    public int[] getNotas() {
        return this.notas;
    }

    // Sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int pos, int nota) {
        this.notas[pos] = nota;
    }

    // Adds
    public void addNota(int nota) {
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] == -1) {
                this.notas[i] = nota;
                return;
            }
        }
        System.out.println("No se agrego la nota, lista llena. Utilice el metodo \"setNota(posicion,nota)\"");
    }

    // Print
    public void printInfo() {
        System.out.printf("Notas de %s:\n", this.nombre);
        // No se como hacer esto mas eficiente :sob:
        int avgCant = 0;
        int avgVal = 0;
        int[] avgArr = { -1, -1, -1, -1, -1 };
        for (int v : this.notas) {
            if (v != -1) {
                avgArr[avgCant] = v;
                avgCant++;
                System.out.printf("| %s\n", v);
            }
        }
        if (avgCant == 0) {
            return;
        }
        for (int v : avgArr) {
            if (v != -1) {
                avgVal += v;
            }
        }
        System.out.printf("Promedio de notas (%s):%s.\n", avgCant, avgVal / avgCant);
    }
}
