package gestion_productos;

import gestion_productos.exceptions.CodigoInvalidoException;
import gestion_productos.exceptions.ProductoNoEncontradoException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Alumno - Hugo Rodriguez
    DAW - Ampliacion de Programacion
    05/12/2025
 */

public class GestionInventario {
    private static final Scanner sc = new Scanner(System.in);
    private static Map<String, Double> inventario = new HashMap<>();

    public static void main(String[] args) {menu();}

    /**
     * Muestra el menú principal y gestiona las opciones del usuario.
     */
    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("==== GESTIÓN DE INVENTARIO ====");
                System.out.println("1. Añadir producto" +
                        "\n2. Buscar producto" +
                        "\n3. Actualizar precio" +
                        "\n4. Mostrar inventario" +
                        "\n5. Salir" +
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
                         actualizarPrecio();
                        break;
                    case 4:
                         mostrarInventario();
                        break;
                    case 5:
                        System.out.println("... Saliendo ...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("La opcion tiene que ser numerica!");
                sc.nextLine();
            }
        } while (opcion != 5);
    }

    /**
     * Metodo para buscar un producto en el inventario por su código.
     * Si el producto no se encuentra, lanza una excepción ProductoNoEncontradoException.
     */
    public static void buscarProducto() {
        System.out.println("Ingrese el código del producto a buscar: ");
        String codigo = sc.nextLine();
        if (inventario.containsKey(codigo)) {
            double precio = inventario.get(codigo);
            System.out.println("Producto encontrado: Código: " + codigo + ", Precio: " + precio);
        } else {
            try {
                throw new ProductoNoEncontradoException("Producto con código " + codigo + " no encontrado.");
            } catch (ProductoNoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Metodo para actualizar el precio de un producto en el inventario.
     * Si el producto no se encuentra, lanza una excepción ProductoNoEncontradoException.
     */
    public static void actualizarPrecio() {
        System.out.println("Ingrese el codigo del producto a actualizar: ");
        String codigo = sc.nextLine();
        if (inventario.containsKey(codigo)) {
            System.out.println("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = sc.nextDouble();
            sc.nextLine();
            inventario.put(codigo, nuevoPrecio);
            System.out.println("Precio actualizado: Código: " + codigo + ", Nuevo Precio: + " + nuevoPrecio);
        } else {
            try {
                throw new ProductoNoEncontradoException("Producto con código " + codigo + " no encontrado.");
            } catch (ProductoNoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Metodo para mostrar todos los productos en el inventario.
     */
    public static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de productos:");
            for (Map.Entry<String, Double> entry : inventario.entrySet()) {
                System.out.println("Código: " + entry.getKey() +" | " +  "Precio: " + entry.getValue());
            }
        }
    }

    /**
     * Metodo para añadir un nuevo producto al inventario.
     */
    public static void añadirProducto() {
        String codigo = "";
        Double precio = 0.0;
        boolean correto;

        do {
            try {
                System.out.println("Ingrese el código del producto (mínimo 3 caracteres, solo letras y números): ");
                codigo = validarCodigo();
                System.out.println("Ingrese el precio del producto (número positivo): ");
                precio = validarPrecio();
                correto = true;
            } catch (CodigoInvalidoException e) {
                System.out.println(e.getMessage());
                correto = false;

            }
        }while (!correto);

        inventario.put(codigo, precio);
        System.out.println("Producto añadido: Código: " + codigo + ", Precio: " + precio);
    }

    /**
     * Valida el código del producto.
     *
     * @return El código válido.
     * @throws CodigoInvalidoException Si el código no cumple con los requisitos.
     */
    public static String validarCodigo() throws CodigoInvalidoException {
        String codigo = sc.nextLine();
        if (codigo.length() >= 3 && codigo.matches("[A-Za-z0-9]+")) {
            return codigo;
        }
        throw new CodigoInvalidoException("Código no válido. Debe tener al menos 3 caracteres y solo contener letras y números.");
    }

    /**
     * Valida el precio del producto.
     *
     * @return El precio válido.
     * @throws CodigoInvalidoException Si el precio no es un número positivo.
     */
    public static Double validarPrecio() throws CodigoInvalidoException {
        Double precio = sc.nextDouble();
        if (precio >=0) {
            return precio;
        }
        throw new CodigoInvalidoException("Precio no válido. Debe ser un número positivo.");
    }

}
