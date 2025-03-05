package Clases.Ej5;

class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Javier");
        Cuenta c2 = new Cuenta("Pedro", 500);
        c1.printInfo();
        c2.printInfo();
        c1.addSaldo(500);
        c2.addSaldo(700);
        c1.subSaldo(100);
        c2.subSaldo(50);
        c1.printInfo();
        c2.printInfo();
    }
}
