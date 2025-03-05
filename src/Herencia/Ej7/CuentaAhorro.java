package Herencia.Ej7;

public class CuentaAhorro extends CuentaBancaria{
    private final int impuesto;

    public CuentaAhorro(int id, float saldo) {
        super(id,saldo);
        this.impuesto = 1;
    }

    public void impuesto() {
        float imp = super.getSaldo() * ((float)this.impuesto / 100);
        super.setSaldo(super.getSaldo() - imp);
        System.out.printf("[ %s ] Impuesto de $%s aplicado. Saldo: $%s%n",super.getId(),imp,super.getSaldo());
    }
}
