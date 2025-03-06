package Herencia.Ej10;

public class Animal {
    private final String tipo;
    private boolean alimentado;

    public Animal(String tipo) {
        this.tipo = tipo;
        this.alimentado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void comer() {
        this.alimentado = true;
    }
}
