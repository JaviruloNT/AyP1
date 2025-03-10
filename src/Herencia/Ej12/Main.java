package Herencia.Ej12;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona(new Tarjeta());
        Persona p2 = new Persona(new Tarjeta());
        //
        System.out.println(p1.pagar(p2, 50));
        p1.getBilletera().ingresar(5000);
        p2.getBilletera().ingresar(10000);
        System.out.println(p1.pagar(p2, 1000));
        System.out.println(p2.cobrar(p1, 2000));
    }
}
