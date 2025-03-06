package Herencia.Ej1y9;

public class Triangulo implements DosDimensiones {
    private final double base;
    private final double altura;
    private final double hipotenusa;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt((base * base) + (altura * altura));
    }

    @Override
    public void info() {
        System.out.printf("[ Triangulo ]%nBase: %s%nAltura: %s%nArea: %s%nPerimetro: %s%n", base, altura, getArea(), getPerimetro());
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return base + altura + hipotenusa;
    }
}
