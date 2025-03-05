package Clases.Ej2;

class Rectangulo {
    private int base;
    private int altura;

    // Build
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Get
    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getArea() {
        return this.base * this.altura;
    }

    public int getPerimeter() {
        return this.base * 2 + this.altura * 2;
    }

    // Set
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Print
    public void printInfo() {
        System.out.printf("Base: %s - Altura: %s | Area: %s - Perimetro: %s\n", this.base, this.altura, this.getArea(),
                this.getPerimeter());
    }

    // Methods
}
