package Herencia.Ej7;

public abstract class CuentaBancaria {
    private final int id;
    private float saldo;

    public CuentaBancaria(int id, float saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public void setSaldo(float v) {
        this.saldo = v;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public int getId() {
        return this.id;
    }

    public void consultar() {
        System.out.printf("[ %s ] Saldo: $%s%n",this.id,this.saldo);
    }

    public void depositar(float cantidad) {
        this.saldo += cantidad;
        System.out.printf("[ %s ] Sumado $%s%n",this.id,cantidad);
    }

    public float retirar(float cantidad) {
        this.saldo -= cantidad;
        System.out.printf("[ %s ] Retirado $%s%n",this.id,cantidad);
        return cantidad;
    }
}
