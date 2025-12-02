package Práctica;

public class P2 {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        String nombre = sc.pedirTexto("Introduce el nombre del producto:");
        String categoria = sc.pedirTexto("Introduce la Categoría:");
        double precio = sc.pedirDecimal("Introduce el precio:\n");

        System.out.println("\n====DATOS PRODUCTO====");
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.printf("Precio: %.2f€%n", precio);

    }
}