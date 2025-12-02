package Práctica;

public class ControlNotas {

    private static final Práctica.MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        String nombre = sc.pedirTexto("Introduce el nombre del alumno:");
        double n1 = comprobarNotas("Introduce la nota de Programación del 0 a 10:\n");
        double n2 = comprobarNotas("Introduce la nota de Base de Producto del 0 a 10:\n");
        double n3 = comprobarNotas("Introduce la nota de Entornos del 0 a 10:\n");

        Alumno alumno = new Alumno(nombre, n1, n2, n3);
        alumno.mostrarinformacion();
    }

    private static double comprobarNotas(String notaValida) {
        while (true) {
            double nota = sc.pedirDecimal(notaValida);
            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Intenta de nuevo.");
            } else {
                return nota;
            }
        }
    }
}
