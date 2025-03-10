package Herencia.Ej12;

public class Persona {
    private String nombre;
    private MetodoPago billetera;

    public Persona(String nombre, MetodoPago metodo) {
        this.nombre = nombre;
        billetera = metodo;
    }

    public MetodoPago getBilletera() {
        return billetera;
    }

    public boolean pagar(Persona persona, double cant) {
        if (!billetera.retirar(cant)) {
            return false;
        }
        return persona.getBilletera().ingresar(cant);
    }

    public boolean cobrar(Persona persona, double cant) {
        if (!persona.getBilletera().retirar(cant)) {
            return false;
        }
        return billetera.ingresar(cant);
    }
}
