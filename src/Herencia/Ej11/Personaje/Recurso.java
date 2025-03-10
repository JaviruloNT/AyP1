package Herencia.Ej11.Personaje;

abstract class Recurso {
    private String recurso;
    private int cantidad;

    Recurso(String nombre) {
        recurso = nombre;
        cantidad = 0;
    }

    String nombre() {
        return recurso;
    }

    int get() {
        return cantidad;
    }

    int set(int cant) {
        cantidad = cant;
        return cantidad;
    }

    int add(int cant) {
        cantidad += cant;
        return cantidad;
    }

    int rem(int cant) {
        cantidad -= cant;
        return cantidad;
    }
}
