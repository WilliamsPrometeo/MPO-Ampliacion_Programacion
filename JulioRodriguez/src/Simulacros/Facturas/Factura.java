package Simulacros.Facturas;

public class Factura {

    // Atributos
    private String cliente;
    private double importeBase;
    private double iva;
    private double descuento;

    // Constructor
    public Factura(String cliente, double importeBase, double iva, double descuento) {
        this.cliente = cliente;
        this.importeBase = importeBase;
        this.iva = iva;
        this.descuento = descuento;
    }

    // Método para calcular el total
    public double calcularTotal() {
        double totalIVA = importeBase * (iva / 100);
        double totalDescuento = importeBase * (descuento / 100);
        return importeBase + totalIVA - totalDescuento;
    }

    // Método para mostrar la información de la factura
    public void mostrarResumen() {
        System.out.println("----- RESUMEN DE FACTURA -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Importe base: " + importeBase + " €");
        System.out.println("IVA aplicado: " + iva + " %");
        System.out.println("Descuento aplicado: " + descuento + " %");
        System.out.printf("Total a pagar: %.2f €%n", calcularTotal());
    }
}