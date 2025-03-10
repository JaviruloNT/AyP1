package Herencia.Ej11.Personaje;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private List<Recurso> recursos = new ArrayList<>();

    public Personaje(String nombre) {
        this.nombre = nombre;
        recursos.add(new Oro()); // idRecurso = 0
        recursos.add(new Madera()); // idRecurso = 1
        recursos.add(new Piedra()); // idRecurso = 2...
    }

    public void add(int idRecurso, int cant) {
        if (idRecurso >= recursos.size()) {
            return;
        }
        System.out.println(recursos.get(idRecurso));
    }
}
