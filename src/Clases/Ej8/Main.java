package Clases.Ej8;

class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Rufus", "Perro", 10);
        Persona persona = new Persona("Javier");
        mascota.printInfo();
        persona.printInfo();
        persona.setMascota(mascota);
        persona.printInfo();
    }
}
