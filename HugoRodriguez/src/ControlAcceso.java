import recursos.MyScanner;

public class ControlAcceso {
    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) {
        int edad = pideEdad();

        System.out.println(comprobarEdad(edad));
        sc.cerrar();
    }

    public static int pideEdad() {
        boolean valido;
        int edad;
        int intentos = 0;

        do{
            edad = sc.pedirNumero("Ingrese su edad: ");
            if (edad < 0 || edad > 120) {
                System.out.println("Error: Edad invalido");
                valido = false;
                intentos++;
            } else  {
                valido = true;
            }

        } while (intentos < 3 && !valido);

        return edad;
    }

    public static String comprobarEdad(int edad) {
        String mensaje;

        if (edad < 18) {
            mensaje = "Acceso denegado: menor de edad.";
        } else if (edad < 65) {
            mensaje = "Acceso permitido.";
        } else {
            mensaje = "Acceso con beneficios para jubilados.";
        }

        return mensaje;
    }
}

