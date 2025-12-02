package Práctica;

public class M3 {

    private static final MyScanner sc = new MyScanner();

    private static final int HORAS_MAX = 70;
    private static final double TARIFA_HORA = 7.5;
    private static final int MAX_INTENTOS = 3;

    public static void main(String[] args) {

        System.out.println("=== CALCULADORA DE HORAS LABORALES ===");

        try {
            // Nombre del trabajador
            String nombre = sc.pedirTexto("Introduce el nombre del trabajador:");

            // Horas trabajadas
            int horas = pedirHoras();

            // Calcular salario
            double salario = calcularSalario(horas, TARIFA_HORA);

            // Mostrar resumen
            mostrarResumen(nombre, horas, TARIFA_HORA, salario);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El programa finalizará por datos inválidos.");
        }
    }

    public static int pedirHoras() throws Exception {
        int intentos = 0;

        while (intentos < MAX_INTENTOS) {
            int horas = sc.pedirNumero(
                    "Introduce las horas trabajadas esta semana (0 - " + HORAS_MAX + "):"
            );

            if (horas >= 0 && horas <= HORAS_MAX) {
                return horas;
            } else {
                System.out.println("Las horas deben estar entre 0 y " + HORAS_MAX + ".");
                intentos++;
            }
        }

        throw new Exception("Demasiados intentos introduciendo las horas.");
    }

    public static double calcularSalario(int horas, double tarifa) {
        return horas * tarifa;
    }

    public static void mostrarResumen(String nombre, int horas, double tarifa, double salario) {
        System.out.println();
        System.out.println("===== RESUMEN SEMANAL =====");
        System.out.println("Trabajador: " + nombre);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Tarifa por hora: " + tarifa + " €");
        System.out.println("Salario total: " + salario + " €");
    }
}
