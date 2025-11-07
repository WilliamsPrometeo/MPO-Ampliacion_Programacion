public class ControlNotas {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        boolean salida = false;
        String nombre = sc.pedirSoloTexto("Introduce el nombre del alumno: ");

        while (!salida) {

            double nota1 = sc.pedirNumero("Introduce el nota del alumno en Programación: ");
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Error, la nota de Programación no es válida.");
                salida = false;
            }
            else {
                double nota2 = sc.pedirNumero("Introduce el nota del alumno en Bases de Datos: ");
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Error, la nota de Bases de Datos no es válida.");
                    salida = false;
                }
                else {
                    double nota3 = sc.pedirNumero("Introduce el nota del alumno en Entornos de Desarrollo: ");
                    if (nota3 < 0 || nota3 > 10) {
                        System.out.println("Error, la nota de Entorno de Desarrollo no es válida.");
                        salida = false;
                    } else {
                        salida = true;
                        Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);
                        alumno.mostrarMedia();
                    }
                }
            }
        }
        sc.cerrar();
    }
}
