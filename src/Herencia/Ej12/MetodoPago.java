package Herencia.Ej12;

public abstract class MetodoPago {
    private double saldo;

    public MetodoPago() {
        saldo = 0;
    }

    public boolean retirar(double cant) {
        if (saldo < cant) {
            return false;
        }
        saldo -= cant;
        return true;
    }

    public boolean ingresar(double cant) {
        saldo += cant;
        return true;
    }
}
