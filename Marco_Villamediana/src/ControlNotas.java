//MARCO VILLAMEDIANA PONCE
//FECHA: 7/11/2025
//No me comprueba las notas bien, osea lo hace igualmente. He puesto el bucle con un double en vez de un void para que no printee en bucle lo mismo

import ejercicio1_2ev.MyScanner;

public class ControlNotas {
    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) {

        String nombre = sc.pedirSoloTexto("Introduce el nombre del alumno: ");
        double nota1 = sc.pedirDecimal("Introduce la nota 1 del alumno: ");
        double nota2 = sc.pedirDecimal("Introduce la nota 2 del alumno: ");
        double nota3 = sc.pedirDecimal("Introduce la nota 3 del alumno: ");

        Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);
        alumno.comprobarNotas1();
        alumno.comprobarNotas2();
        alumno.comprobarNotas3();
        alumno.calcularMedia();

        alumno.mostrarAlumno();

        sc.cerrar();
    }
}
