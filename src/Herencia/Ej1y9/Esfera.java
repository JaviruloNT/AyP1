package Herencia.Ej1y9;

public class Esfera implements TresDimensiones {
    private final double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public void info() {
        System.out.printf("[ Esfera ]%nRadio: %s%nArea: %s%nVolumen: %s%n", radio, getArea(), getVolumen());
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
}
