package Práctica;

import java.util.ArrayList;

public class P4 {

    // Usamos tu MyScanner
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        double precio = sc.pedirDecimal("Introduce un precio:\n");
        int iva = 21;
        double calcularIVA = precio * iva /100;

        System.out.println("\n===RESULTADO===");
        System.out.printf("Precio: %.2f€%n", precio);
        System.out.printf("IVA 0,21: %.2f€%n", calcularIVA);
        System.out.printf("Total: %.2f€%n", calcularIVA + precio);

    }
}
