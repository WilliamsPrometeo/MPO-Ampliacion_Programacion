package Práctica;

public class P1 {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        double precio;

        do {
            precio = sc.pedirDecimal("Introduce el precio (este no puede ser negativo): ");

            if (precio < 0) {
                System.out.println("Error: el precio no puede ser negativo. Inténtalo de nuevo.\n");
            }

        } while (precio < 0);

        System.out.println("Precio válido: " + precio);

    }
}
