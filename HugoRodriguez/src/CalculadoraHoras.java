/*
Alumno: Hugo
Curso: DAW 1 - Ampliacion
Fecha: 13/11/2025
 */

public class CalculadoraHoras {
    // Constantes según recomendaciones
    private static final int HORAS_MIN = 0;
    private static final int HORAS_MAX = 70;
    private static final double TARIFA_POR_HORA = 7.5;
    private static final int MAX_INTENTOS = 3;
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE HORAS LABORALES ===");

        // Pedir nombre del empleado
        String nombre = pedirNombre();

        // Pedir horas trabajadas con validación
        int horas = pedirHoras();

        // Calcular salario
        double salario = calcularSalario(horas, TARIFA_POR_HORA);

        // Mostrar resumen
        mostrarResumen(nombre, horas, TARIFA_POR_HORA, salario);

        sc.cerrar();
    }

    /**
     * Método para pedir el nombre del empleado.
     * @return El nombre introducido.
     */
    private static String pedirNombre() {
        return sc.pedirSoloTexto("Introduce el nombre del empleado: ");
    }

    /**
     * Método para pedir las horas trabajadas, con validación de rango y máximo de intentos.
     * @return Las horas válidas.
     */
    private static int pedirHoras() {
        int intentos = 0;
        while (true) {
            int horas = sc.pedirNumero("Introduce las horas trabajadas esta semana: ");
            if (horas >= HORAS_MIN && horas <= HORAS_MAX) {
                return horas;
            } else {
                intentos++;
                System.out.println("Horas inválidas. Deben estar entre " + HORAS_MIN + " y " + HORAS_MAX + ".");
                if (intentos >= MAX_INTENTOS) {
                    System.out.println("Número máximo de intentos alcanzado. Finalizando el programa.");
                    System.exit(0); // Terminar elegantemente
                }
                System.out.println("Intento " + intentos + " de " + MAX_INTENTOS + ". Intenta de nuevo.");
            }
        }
    }

    /**
     * Método para calcular el salario basado en horas y tarifa.
     * @param horas Horas trabajadas.
     * @param tarifa Tarifa por hora.
     * @return El salario total.
     */
    private static double calcularSalario(int horas, double tarifa) {
        return horas * tarifa;
    }

    /**
     * Método para mostrar el resumen semanal.
     * @param nombre Nombre del empleado.
     * @param horas Horas trabajadas.
     * @param tarifa Tarifa por hora.
     * @param salario Salario total.
     */
    private static void mostrarResumen(String nombre, int horas, double tarifa, double salario) {
        System.out.println("\n===== RESUMEN SEMANAL =====");
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Tarifa por hora: " + tarifa + " €");
        System.out.println("Salario total: " + salario + " €");
    }
}