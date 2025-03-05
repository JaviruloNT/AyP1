package Herencia.Ej3;

public class Moto implements Vehiculo {
	private int aceleracion;
	private int velocidad;

	public Moto(int aceleracion) {
		this.aceleracion = aceleracion;
		this.velocidad = 0;
	}

	public Moto() {
		this(10);
	}

	@Override
	public int acelerar(int segundos) {
		this.velocidad += this.aceleracion * segundos;
		return this.velocidad;
	}

	public int acelerar() {
		this.acelerar(1);
		return this.velocidad;
	}

	@Override
	public int frenar(int segundos) {
		this.velocidad -= this.aceleracion * segundos;
		return this.velocidad;
	}

	public int frenar() {
		this.frenar(1);
		return this.velocidad;
	}
}
