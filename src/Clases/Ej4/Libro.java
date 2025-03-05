package Clases.Ej4;

class Libro {
    // Vars
    private String titulo;
    private String autor;
    private int ano;

    // Builder
    public Libro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Gets
    public String getTitulo() {
        return this.titulo;
    }

    public void printInfo() {
        System.out.printf("%s\n| Autor: %s\n| Ano: %s\n", this.titulo, this.autor, this.ano);
    }
}
