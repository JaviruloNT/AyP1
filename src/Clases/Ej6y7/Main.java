package Clases.Ej6y7;

class Main {
    public static void main(String[] args) {
        Fecha fechaMal1 = new Fecha(35, 12, 2025);
        Fecha fechaMal2 = new Fecha(28, 20, 2025);
        Fecha fecha = new Fecha(28, 12, 2025);
        fechaMal1.print();
        fechaMal2.print();
        fecha.print();
        fecha.incrementar(10);
        fecha.print();
    }
}
