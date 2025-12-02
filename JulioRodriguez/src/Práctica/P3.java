package Práctica;

import java.util.ArrayList;

public class P3 {

    // Usamos tu MyScanner
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        listaDePrecios();
    }

    private static void listaDePrecios() {

        System.out.println("=== LISTA DE PRECIOS ===");

        int cantidad = sc.pedirNumero("¿Cuántos precios quieres introducir?");
        while (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            cantidad = sc.pedirNumero("Vuelve a introducir la cantidad:");
        }

        ArrayList<Double> precios = new ArrayList<>();

        double total = 0;
        double maximo = 0;
        double minimo = 0;

        for (int i = 0; i < cantidad; i++) {
            double precio = sc.pedirDecimal("Introduce el precio " + (i + 1) + ": ");

            precios.add(precio);

            total = total + precio;

            if (i == 0) {
                maximo = precio;
                minimo = precio;
            } else {

                if (precio > maximo) {
                    maximo = precio;
                }
                if (precio < minimo) {
                    minimo = precio;
                }
            }
        }

        double media = total / cantidad;

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Media: %.2f%n", media);
        System.out.printf("Máximo: %.2f%n", maximo);
        System.out.printf("Mínimo: %.2f%n", minimo);
    }
}
