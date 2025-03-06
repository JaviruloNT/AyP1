package Herencia.Ej1y9;

public class Cuadrado implements DosDimensiones {
    private final double tamano;

    public Cuadrado(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public void info() {
        System.out.printf("[ Cuadrado ]%nTamano: %s%nArea: %s%nPerimetro: %s%n", tamano, getArea(), getPerimetro());
    }

    @Override
    public double getArea() {
        return Math.pow(tamano, 2);
    }

    @Override
    public double getPerimetro() {
        return tamano * 4;
    }
}
