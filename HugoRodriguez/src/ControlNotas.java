import recursos.MyScanner;

public class ControlNotas {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        System.out.println("---Notas Alumno---");

        String alumno = sc.pideTexto("Introduce el nombre del alumno: ");
        double Nota1 = pedirNota1();
        double Nota2 = pedirNota2();
        double Nota3 = pedirNota3();

        // Crear objeto media
        Alumno media = new Alumno(Nota1, Nota2, Nota3);
        // Mostrar resumen

        media.MostrarResumen();
    }

    public static double pedirNota1() {
        boolean valido;
        double Nota1;
        do {
            Nota1 = sc.pedirDecimal("Introduce tu primera nota: ");
            if (Nota1 < 0 || Nota1 > 10) {
                System.out.println("El valor introducido no es valido");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);
        return Nota1;


    }

    public static double pedirNota2() {
        boolean valido;
        double Nota2;
        do {
            Nota2 = sc.pedirDecimal("Introduce tu segunda nota: ");
            if (Nota2 < 0 || Nota2 > 10) {
                System.out.println("El valor introducido no es valido");
                valido = false;
            } else {
                valido = true;
            }
        } while (!valido);
        return Nota2;
    }
    public static double pedirNota3() {
        boolean valido;
        double Nota3;

        do {
            Nota3 = sc.pedirDecimal("Introduce tu segunda nota: ");
            if (Nota3 < 0 || Nota3 > 10) {
                System.out.println("El valor introducido no es valido");
                valido = false;
            } else {
                valido = true;
            }

        } while (!valido);

        return Nota3;
    }
}
