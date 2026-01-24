package evaluacion1.ejercico4;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Inventario {
    private static final Scanner sc = new Scanner(System.in);
    private static Map<String, String> inventario = new HashMap<>();

    public static void main(String[] args) {
        menu();
    }

    /**
     * Método para mostrar el menú
     */
    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("==== GESTIÓN DE USUARIOS ====");
                System.out.println("1. Añadir producto" +
                        "\n2. Buscar producto" +
                        "\n3. Actualizar precio" +
                        "\n4. Mostrar inventario" +
                        "\n5. Salir"+
                        "\nOpcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        añadirProducto();
                        break;
                    case 2:
                        buscarProducto();
                        break;
                    case 3:
                        actualizarProducto();
//                        actualizarPrecio();
                        break;
                    case 4:
                        mostrarInventario();
                        break;
                    case 5:
                        System.out.println("... Saliendo ...");
                        break;
                    default:
                        System.out.println("Opcion no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opcion tiene que ser numerica!");
                sc.nextLine();
            }
        } while (opcion != 5);
    }

    /**
     * Método para añadir un producto
     * @throws CodigoInvalidoException que envia un mensaje de error si no se cumplen los requisitos
     */

    public static void añadirProducto() {
        String producto ="";
        double precio = 0;
        boolean correcto;

        do {
            try {
                producto = validarProducto();
                correcto = true;
            } catch (CodigoInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        do {
            try{
                precio = Double.parseDouble(validarPrecio());
                correcto = true;
            } catch (PrecioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        inventario.put(producto, String.valueOf(precio));
        System.out.println("Producto registrado correctamente");
    }

    /**
     * Método para buscar un producto
     * @throws ProductoNoEncontradoException que envia un mensaje de error si no se cumplen los requisitos
     */

    public static void buscarProducto()  {
        System.out.println("Introduzca el código del producto que desea buscar: ");
        String code = sc.nextLine();
        if(inventario.containsKey(code)) {
            System.out.println("El código del producto es: "+code+ " y su precio es de " +inventario.get(code));
        }
    }

    /**
     * Metodo para actualizar el producto
     * @throws ProductoNoEncontradoException que envia un mensaje de error si no se cumplen los requisitos
     */

    public static void actualizarProducto() {
        System.out.println("Indique el codigo del producto que desea actualizar: ");
        String code = sc.next();
        String codigo = "";
        double precio = 0;
        boolean correcto;
        do {
            try {
                codigo = validarProducto();
                correcto = true;
            } catch (CodigoInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        do {
            try{
                precio = Double.parseDouble(validarPrecio());
                correcto = true;
            } catch (PrecioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);
        inventario.remove(code);
        inventario.put(codigo, String.valueOf(precio));
        System.out.println("Producto actualizado correctamente");
    }

//    public static void actualizarPrecio() throws PrecioInvalidoException {
//        System.out.println("Introduzca el precio que desea actualizar: ");
//        double precio = sc.nextDouble();
//        try {
//            if(precio >= 0) {
//            System.out.println("El precio se ha actualizado correctamente");
//            }
//        } catch (PrecioInvalidoException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    /**
     * Metodo para mostrar el Inventario
     */
    public static void mostrarInventario() {
        for (Map.Entry<String, String> entry : inventario.entrySet()) {
            System.out.println("Código: " +entry.getKey() + " | Precio: " + entry.getValue());
        }
    }

    /**
     * Metodo para validar el Producto
     * @return
     * @throws CodigoInvalidoException que envia un mensaje de error si no se cumplen los requisitos
     */

    public static String validarProducto() throws CodigoInvalidoException {
        System.out.println("Introduce el código del producto: ");
        String producto = sc.nextLine();
        if (producto.length() >= 3 && producto.matches("[A-Z0-9]+")){
            return producto;
        }
        throw new CodigoInvalidoException("Código del producto no válido");
    }

    /**
     * Metodo para validar el precio
     * @return
     * @throws PrecioInvalidoException que envia un mensaje de error si no se cumplen los requisitos
     */

    public static String validarPrecio() throws PrecioInvalidoException {
        System.out.println("Introduce el precio: ");
        double precio = sc.nextDouble();
        if (precio >= 0) {
            return String.valueOf(precio);
        }
        throw new PrecioInvalidoException("Precio invalido");
    }

}


