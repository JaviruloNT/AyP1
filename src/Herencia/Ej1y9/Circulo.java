package Herencia.Ej1y9;

public class Circulo implements DosDimensiones {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void info() {
        System.out.printf("[ Circulo ]%nRadio: %s%nArea: %s%nPerimetro: %s%n", radio, getArea(), getPerimetro());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}
