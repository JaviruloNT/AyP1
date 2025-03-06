package Herencia.Ej8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Automovil> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(new Automovil(i + 1));
        }
        int t = 0;
        for (Automovil auto : lista) {
            while (t <= 120 && auto.getVelocidad() != 0) {
                auto.avanzar();
                t++;
            }
            //
            t = 1;
        }
        for (Automovil auto : lista) {
            if (auto.getVelocidad() == 0) {
                System.out.printf("El auto #%s ha fallado al segundo %s. Distancia recorrida: %s%n", auto.getId(), auto.getDistancia() / 10, auto.getDistancia());
            } else {
                System.out.printf("El auto #%s ha completado el recorrido.%n", auto.getId());
            }
        }
    }
}
