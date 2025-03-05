package Herencia.Ej7;

public class CuentaCorriente extends CuentaBancaria{
    private final int impuesto;

    public CuentaCorriente(int id, float saldo) {
        super(id,saldo);
        this.impuesto = 1;
    }

    public float impuesto(float cantidad) {
        float imp = cantidad * ((float)this.impuesto / 100);
        System.out.printf("[ %s ] Impuesto de $%s aplicado. Mover: $%s%n",super.getId(),imp,cantidad - imp);
        return cantidad - imp;
    }

    @Override
    public float retirar(float cantidad) {
        cantidad = this.impuesto(super.retirar(cantidad));
        return cantidad;
    }

    @Override
    public void depositar(float cantidad) {
        cantidad = this.impuesto(cantidad);
        super.depositar(cantidad);
    }
}
