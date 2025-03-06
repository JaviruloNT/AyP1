package Herencia.Ej10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> lista = new ArrayList<>();
        // Poblar
        lista.add(new Leon());
        lista.add(new Tigre());
        lista.add(new Oso());
        // Comer
        for (Animal v : lista) {
            v.comer();
            System.out.printf("%s alimentado: %s%n", v.getTipo(), v.isAlimentado());
        }
    }
}
