package Herencia.Ej8;

public class Automovil implements Transporte {
    private final int aceleracion; // m/1s
    private int velocidad; // m/s
    private int distancia;

    public Automovil(int metrosPorSegundo) {
        this.aceleracion = metrosPorSegundo;
        this.velocidad = 0;
        this.distancia = 0;
    }

    public void addDistancia() {
        // Realizar cada segundo
        this.distancia += this.velocidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int getDistancia() {
        return this.distancia;
    }

    @Override
    public boolean error() {
        return Math.random() > 0.5;
    }

    @Override
    public int acelerar(int segundos) {
        this.velocidad += this.aceleracion * segundos;
        return this.velocidad;
    }

    @Override
    public int frenar(int segundos) {
        this.velocidad -= this.aceleracion * segundos;
        return this.velocidad;
    }
}
