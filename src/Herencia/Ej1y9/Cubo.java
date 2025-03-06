package Herencia.Ej1y9;

public class Cubo implements TresDimensiones {
    private final double tamano;

    public Cubo(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public void info() {
        System.out.printf("[ Cubo ]%nTamano: %s%nArea: %s%nVolumen: %s%n", tamano, getArea(), getVolumen());
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(tamano, 2);
    }

    @Override
    public double getVolumen() {
        return Math.pow(tamano, 3);
    }
}
