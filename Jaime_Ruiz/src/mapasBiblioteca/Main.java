package mapasBiblioteca;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

  /*
    Alumno - Jaime Ruiz
    DAW - Ampliacion de Programacion
    16/01/2026
 */

public class Main {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> inventario = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("==== Gestión Biblioteca ====");
        boolean exit;
        do {
            exit = false;
            int opcion = sc.pedirNumero("1. Registrar libro" +
                    "\n2. Mostar catálogo" +
                    "\n3. Gestionar ejemplares" +
                    "\n4. Salir");
            switch (opcion) {
                case 1:
                    registrarLibro();

                    break;
                case 2:
                    mostrarCatalogo();

                    break;
                case 3:
                    gestionarEjemplares();

                    break;
                case 4:
                    System.out.println("Saliendo ....");
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (!exit);
    }

    public static void registrarLibro() {
        boolean correcto;
        int isbn = 0;

        do {
            correcto = true;
            try {
                isbn = sc.pedirNumero("Ingrese el ISBN: ");
                if (String.valueOf(isbn).length() < 5) {
                    throw new IsbnInvalidoException("Debe tener al menos 5 dígitos ");

                } else {
                    for (Libro libro : libros) {
                        if (libro.getIsbn() == isbn) {
                            throw new IsbnInvalidoException("El isbn ya existe");

                        }
                    }
                }
            } catch (IsbnInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        String titulo = sc.pedirSoloTexto("Introduce el titulo del libro: ");
        String autor = sc.pideTexto("Introduce el autor del libro: ");
        int anioPublicacion = 0;
        do {
            correcto = true;

            try {
                anioPublicacion = sc.pedirNumero("Introduce el año de publicación del libro: ");
                if (anioPublicacion < 0) {
                    throw new AnioInvalidoException("El año de publicación tiene que ser mayor que 0");
                }
            } catch (AnioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }

        } while (!correcto);

        libros.add(new Libro(isbn, titulo, autor, anioPublicacion));

    }

    public static void mostrarCatalogo() {
        for (Libro libro : inventario.keySet()) {
            System.out.printf("%s - Cantidad en stock: %s\n", libro, inventario.get(libro));
        }
    }

    public static void gestionarEjemplares() {
        boolean correcto;
        for (Libro libro : libros) {
            int cantidad = 0;
            do {
                correcto = true;
                try {
                    System.out.println(libro);
                    cantidad = sc.pedirNumero("Introduce los ejemplares del libro: ");
                    if (cantidad < 0) {
                        throw new CantidadInvalidaException("La cantidad de ejemplares no puede ser negativa");
                    }
                } catch (CantidadInvalidaException e) {
                    System.out.println(e.getMessage());
                    correcto = false;
                }
            } while (!correcto);

            inventario.put(libro, cantidad);
        }


    }
}





