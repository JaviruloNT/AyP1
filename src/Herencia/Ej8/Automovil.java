package Herencia.Ej8;

public class Automovil implements Transporte {
    private final int id;
    private int velocidad; // m/s
    private int distancia;
    private final double chance_de_error;

    public Automovil(int id) {
        this.id = id;
        this.velocidad = 10;
        this.distancia = 0;
        this.chance_de_error = 0.01; // Posibilidad de error
    }

    // Gets
    public int getId() {
        return id;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getDistancia() {
        return distancia;
    }

    // Metodos de interfaz Transporte
    @Override
    public boolean error() {
        return Math.random() >= chance_de_error;
    }

    @Override
    public void avanzar() {
        if (!error()) {
            frenar();
        }
        distancia += velocidad;
    }

    @Override
    public void frenar() {
        velocidad = 0;
    }
}
