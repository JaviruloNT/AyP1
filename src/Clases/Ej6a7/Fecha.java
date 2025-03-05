package Clases.Ej6a7;

class Fecha {

    private static int[] MAX_DIAS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        if (mes > 12 || mes < 0) {
            System.out.println("Mes invalido.");
            mes = 1;
        }
        if (dia > MAX_DIAS[mes - 1] || dia < 0) {
            System.out.println("Dia invalido");
            dia = 1;
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void incrementar(int v) {
        this.dia += v;
        while (this.dia > MAX_DIAS[this.mes - 1]) {
            // Sumar mes
            this.dia -= MAX_DIAS[this.mes - 1];
            this.mes++;
            while (this.mes > 12) {
                // Sumar ano
                this.mes -= 12;
                this.ano++;
            }
        }
    }

    public void print() {
        System.out.printf("%s/%s/%s\n", this.dia, this.mes, this.ano);
    }
}
