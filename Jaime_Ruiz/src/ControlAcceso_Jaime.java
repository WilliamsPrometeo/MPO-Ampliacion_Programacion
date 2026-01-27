import mapasBiblioteca.MyScanner;

public class ControlAcceso_Jaime {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        int edad = pideEdad();


        System.out.println(comprobarEdad(edad));

    }

    public static int pideEdad() {

        int edad;
        for (int intentos = 0; intentos < 3; intentos++) {
                edad = sc.pedirNumero("Ingrese la edad: ");
                if (edad >= 120 || edad <= 0) {
                    System.out.println("El rango de edad no es valido.");
                } else {
                    return edad;
                }

            }

        System.out.println("Has superado el número máximo de intentos.");
        return -1;
    }

    public static String comprobarEdad(int edad) {
        String mensaje;

            if (edad >= 65) {
                mensaje = "Beneficios para jubilado";
            } else if (18 < edad && edad < 65) {
                mensaje = "Acceso permitido";
            } else {
                mensaje = "Acceso denegado: menor de edad.";
            }

            return mensaje;
        }

}
