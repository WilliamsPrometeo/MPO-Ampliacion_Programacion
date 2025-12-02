package Simulacros.Facturas;

import Simulacros.MyScanner;

public class MainFactura {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        System.out.println("=== GESTOR DE FACTURAS ===");

        String cliente = sc.pedirTexto("Introduce el nombre del cliente: ");
        double base = sc.pedirDecimal("Introduce el importe base (€): ");
        double iva = sc.pedirDecimal("Introduce el porcentaje de IVA: ");
        double descuento = sc.pedirDecimal("Introduce el porcentaje de descuento: ");

        // Crear objeto Factura
        Factura factura = new Factura(cliente, base, iva, descuento);

        // Mostrar resumen
        factura.mostrarResumen();

        sc.cerrar();
    }
}