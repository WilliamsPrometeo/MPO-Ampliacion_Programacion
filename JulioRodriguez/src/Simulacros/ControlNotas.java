package Simulacros;

public class ControlNotas {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        System.out.println("=== CONTROL DE NOTAS ===");
        String nombre = sc.pedirTexto("Introduce el nombre del Alumno: ");
        String asignatura1 = sc.pedirTexto("Introduce el nombre de la Asignatura 1: ");
        double nota1 = sc.pedirDecimal("Introduce la nota 1: ");
        String asignatura2 = sc.pedirTexto("Introduce el nombre de la Asignatura 2: ");
        double nota2 = sc.pedirDecimal("Introduce la nota 2: ");
        String asignatura3 = sc.pedirTexto("Introduce el nombre de la Asignatura 3: ");
        double nota3 = sc.pedirDecimal("Introduce la nota 3: ");

        Alumno alumno = new Alumno(nombre,asignatura1,nota1,asignatura2,nota2,asignatura3,nota3);

        alumno.mostrarCalculo();

        sc.cerrar();
    }
}