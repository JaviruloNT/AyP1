package Clases.Ej8;

class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    // Builder
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Mascota() {
        this("", "", 0);
    }

    // Gets
    public String getNombre() {
        return this.nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public int getEdad() {
        return this.edad;
    }

    public void printInfo() {
        System.out.printf("%s | Mascota\nEspecie: %s\nEdad: %s\n", this.nombre, this.especie, this.edad);
    }
}
