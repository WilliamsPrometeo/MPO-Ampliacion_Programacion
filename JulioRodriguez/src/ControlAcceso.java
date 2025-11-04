import clases.MyScanner;

public class ControlAcceso {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        int edad = pideEdad();
        System.out.println(comprobarEdad(edad));
    }

    public static int pideEdad() {
        int intentos = 0;
        boolean valido = false;
        int edad = 0;

        while (intentos < 3 && !valido) {
            edad = sc.pedirNumero("Introduce tu edad: ");

            if (edad < 0 || edad > 120) {
                intentos++;
                System.out.println("Error: Edad no válida. Intento " + intentos + " de 3.");
            } else {
                valido = true;
            }
        }

        if (!valido) {
            System.out.println("Demasiados intentos. Programa finalizado.");
            System.exit(0);
        }

        return edad;
    }

    public static String comprobarEdad(int edad) {
        if (edad >= 18 && edad <= 65) {
            return "Acceso permitido.";
        } else if (edad > 65) {
            return "Acceso con beneficios para jubilados.";
        } else {
            return "Acceso denegado: menor de edad.";
        }
    }

}
