package Herencia.Ej3;

public class Main {
	public static void main(String[] args) {
		Auto auto = new Auto(50); // 50 m/s
		Moto moto = new Moto(); // 10 m/s

		System.out.println(moto.acelerar(10)); // 10 m/s * 10 s = 100 m/s
		System.out.println(auto.acelerar(3)); // 50 m/s * 3 s = 150 m/s
		System.out.println(moto.frenar(5)); // 10 m/s * 5 s = 50 m/s
		System.out.println(auto.frenar()); // 50 m/s * 1 s = 50 m/s
		//
	}
}
