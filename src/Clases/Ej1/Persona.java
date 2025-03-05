package Clases.Ej1;

class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Builder
    public Persona() {
    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void printInfo() {
        System.out.printf("%s - %s - %s.\n", this.nombre, this.edad, this.genero);
    }
}
