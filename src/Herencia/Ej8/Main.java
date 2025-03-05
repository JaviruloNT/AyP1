package Herencia.Ej8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transporte> lista = new ArrayList<>();
        Automovil auto = new Automovil(10);
        lista.add(auto);
        auto.acelerar(5);
        System.out.println(auto.getVelocidad());
    }
}
