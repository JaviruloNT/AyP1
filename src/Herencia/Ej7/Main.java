package Herencia.Ej7;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente CC1 = new CuentaCorriente(12345678,15000);
        CuentaCorriente CC2 = new CuentaCorriente(87654321,50000);
        CuentaAhorro CA1 = new CuentaAhorro(12345678,50000);
        CuentaAhorro CA2 = new CuentaAhorro(87654321,15000);
        // Cuenta Corriente
        CC1.consultar();
        CC2.consultar();
        CC1.retirar(5000);
        CC2.depositar(5000);
        // Cuenta Ahorro
        CA1.consultar();
        CA1.impuesto();
        CA2.consultar();
        CA1.retirar(5000);
        CA2.depositar(5000);
        CA2.impuesto();
    }
}
