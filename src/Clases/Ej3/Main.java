package Clases.Ej3;

class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Javier", new int[] { 1, 2 });
        Estudiante e2 = new Estudiante("Pedro");
        e1.addNota(3);
        e2.addNota(5);
        e1.setNota(4, 10);
        e2.setNota(4, 10);
        e1.printInfo();
        e2.printInfo();
    }
}
