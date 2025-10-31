import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        final int edadminima = 18;

        do {
            System.out.print("¿Cuál es su edad?: ");
            edad = sc.nextInt();
            if (edad > 18) {
                System.out.println("Acceso denegado:menor de edad");
            }
            else if (edad < 120) {
                System.out.println("Acceso denegado:edad no permitidad");
            }

        }
        while (edad < 18); {
            System.out.print("Su edad es 18: ");
            edad = sc.nextInt();

            if (edad < 65) {
                System.out.println("Acceso con beneficios para jubilados");
            }
            else if (edad < 18) {
                System.out.println("Acceso permitido");
            }

        }
    }
}
