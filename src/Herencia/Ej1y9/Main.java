package Herencia.Ej1y9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Listas
        List<DosDimensiones> lista2d = new ArrayList<>();
        List<TresDimensiones> lista3d = new ArrayList<>();
        // 2d
        lista2d.add(new Cuadrado(5));
        lista2d.add(new Circulo(5));
        lista2d.add(new Triangulo(5, 5));
        // 3d
        lista3d.add(new Cubo(5));
        lista3d.add(new Esfera(5));
        // Operaciones
        for (DosDimensiones v : lista2d) {
            v.info();
        }
        for (TresDimensiones v : lista3d) {
            v.info();
        }
    }
}
