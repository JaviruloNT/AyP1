package Clases.Ej8;

class Persona {
    private String nombre;
    private Mascota mascota;

    // Builder
    public Persona(String nombre, Mascota mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }

    public Persona(String nombre) {
        this(nombre, null);
    }

    // Sets
    public void setMascota(Mascota v) {
        this.mascota = v;
    }

    // Gets
    public Mascota getMascota() {
        return this.mascota;
    }

    public void printInfo() {
        System.out.printf("%s | Persona\nMascota: ", this.nombre);
        if (this.mascota == null) {
            System.out.printf("%s\n", "Niguna");
        } else {
            System.out.printf("%s\n", this.mascota.getNombre());
        }
    }
}
