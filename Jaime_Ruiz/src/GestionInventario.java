
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


    /*
    Alumno - Jaime Ruiz
    DAW - Ampliacion de Programacion
    5/12/2025
 */

public class GestionInventario {

    //inicializamos el metodo Scanner
    private static final Scanner sc = new Scanner(System.in);
    //inicializamos el mapa
    private static Map<String, Double> productos = new HashMap<>();

    public static void main(String[] args) {
        menu();
    }

    /**
     * Metodo para llamar al menu
     */
    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("==== GESTIÓN DE PRODUCTOS ====");
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
                        try {
                            actualizarPrecio();
                        } catch (ProductoNoEncontradoException e) {
                            System.out.println(e.getMessage());
                        } catch (PrecioInvalidoException e) {
                            throw new RuntimeException(e);
                        }
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
            } catch (InputMismatchException e) {
                System.out.println("La opcion tiene que ser numerica!");
                sc.nextLine();
            } catch (CodigoInvalidoException e) {
                throw new RuntimeException(e);
            } catch (PrecioInvalidoException e) {
                throw new RuntimeException(e);
            }
        } while (opcion != 5);
    }

    /**
     * Metodo para actualizar el precio del producto y añadirlo al mapa
     *
     * @throws ProductoNoEncontradoException si no encuentra el codigo del producto lanza una excepcion
     * @throws PrecioInvalidoException       si el precio es menor a 0 lanza una excepcion
     */
    public static void actualizarPrecio() throws ProductoNoEncontradoException, PrecioInvalidoException {
        System.out.println("Introduzca el nombre del producto: ");
        String codigo = sc.nextLine();
        if (!productos.containsKey(codigo)) {
            throw new ProductoNoEncontradoException("Producto no encontrado!");
        } else {
            System.out.println("Introduzca el precio que le quieres poner al producto: ");
            Double precioNuevo = sc.nextDouble();

            if (precioNuevo < 0) {
                throw new PrecioInvalidoException("Precio negativo!");
            } else {
                productos.put(codigo, precioNuevo);
            }

        }


    }

    /**
     * Metodo para buscar el producto a traves del codigo
     *
     * @throws ProductoNoEncontradoException si no encuentra el codigo del producto lanza una excepcion
     */
    public static void buscarProducto() {
        System.out.println("Introduce el codigo del producto: ");
        String nombre = sc.nextLine();
        try {
            if (productos.containsKey(nombre)) {
                System.out.println("Producto encontrado: " + nombre);
            } else {
                throw new ProductoNoEncontradoException("Producto no encontrado!");
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

    }


    /**
     * Metodo para añadir productos
     *
     * @throws CodigoInvalidoException lanza una excepcion si el codigo contiene minusculas y si es menor que 3 letras o digitos
     * @throws PrecioInvalidoException lanza la excepcion si el precio es menor que 0
     */
    public static void añadirProducto() throws CodigoInvalidoException, PrecioInvalidoException {
        String codigo = "";
        double precio = 0.0;
        boolean correcto;

        do {
            codigo = validarCodigo();
            correcto = true;
        } while (!correcto);

        do {
            precio = validarPrecio();
            correcto = true;
        } while (!correcto);

        productos.put(codigo, precio);
        System.out.println("Producto añadido correctamente!");
    }


    /**
     * Metodo que muestra el inventario
     */
    public static void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos!");
        } else {
            System.out.println("Inventario:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println(entry.getKey() + "|" + entry.getValue());
            }
        }
    }


    /**
     *
     * @return el codigo del producto
     * @throws CodigoInvalidoException lanza una excepcion si el codigo contiene minusculas y si es menor que 3 letras o digitos
     */
    public static String validarCodigo() throws CodigoInvalidoException {
        System.out.println("Introduzca el codigo del producto: ");
        String codigo = sc.nextLine();
        if (codigo.length() >= 3 && codigo.matches("[A-Z0-9]+")) {
            return codigo;
        }
        throw new CodigoInvalidoException("Codigo no valido!");
    }

    /**
     *
     * @return el precio del producto
     * @throws PrecioInvalidoException lanza la excepcion si el precio es menor que 0
     */
    public static Double validarPrecio() throws PrecioInvalidoException {
        System.out.println("Introduzca el precio del producto: ");
        Double precio = sc.nextDouble();
        if (precio > 0) {
            return precio;
        }
        throw new PrecioInvalidoException("Precio no valido");
    }
}


