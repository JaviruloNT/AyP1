package Clases.Ej5;

class Cuenta {
    public static int cuentas = 0;
    private String titular;
    private int saldo;
    private int id;

    // Builder
    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.id = cuentas;
        cuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    // Sets
    public void addSaldo(int cantidad) {
        this.saldo += cantidad;
        System.out.printf("%s: Agregado $%s. Saldo actual: $%s\n", this.id, cantidad, this.saldo);
    }

    public void subSaldo(int cantidad) {
        this.saldo -= cantidad;
        System.out.printf("%s: Sustraido $%s. Saldo actual: $%s\n", this.id, cantidad, this.saldo);
    }

    // Gets
    public int getSaldo() {
        return this.saldo;
    }

    public void printInfo() {
        System.out.printf("%s:\nTitular: %s\nSaldo: $%s\n", this.id, this.titular, this.saldo);
    }
}
