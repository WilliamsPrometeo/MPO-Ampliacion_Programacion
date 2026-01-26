package segundaevaluacion.gestionBiblioteca;

import recursos.MyScanner;
import segundaevaluacion.gestionBiblioteca.exceptions.AnioInvalidoException;
import segundaevaluacion.gestionBiblioteca.exceptions.CantidadInvalidaException;
import segundaevaluacion.gestionBiblioteca.exceptions.IsbnInvalidoException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/*
    Alumno - Hugo Rodriguez
    DAW - Ampliacion de Programacion
    16/01/2025
 */

public class gestionBiblioteca {
    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> inventario = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("==== GESTION BIBLIOTECA ==== ");
        boolean exit;
        do {
            exit = false;
            int opcion = sc.pedirNumero("1. Añadir libro" +
                    "\n2. Mostrar catalogo" +
                    "\n3. Gestionar ejemplares" +
                    "\n4. Salir");
            switch (opcion) {
                case 1:
                    addLibro();
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

    public static void addLibro() {
        boolean correcto;
        String isbn = "";
        do {
            correcto = true;
            try {
                isbn = sc.pideTexto("Introduce el ISBN del libro: ");
                if (isbn =="") {
                    throw new IsbnInvalidoException("El isbn no puede estar vacio");
                } else if (String.valueOf(isbn).length() < 5){
                    throw new IsbnInvalidoException("El isbn debe tener al menos 5 caracteres");
                }else {
                    for(Libro libro : libros) {
                        if (libro.getIsbn().equals(isbn)) {
                            throw new IsbnInvalidoException("El isbn ya existe en el catalogo");
                        }
                    }
                }
            } catch (IsbnInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);

        String titulo = sc.pideTexto("Introduce el titulo del libro: ");
        String autor = sc.pideTexto("Introduce el autor del libro: ");
        int anioPublicacion = 0;
        do {
            correcto = true;
            try {
                anioPublicacion = sc.pedirNumero("Introduce el año de publicación del libro: ");
                if (anioPublicacion < 0) {
                    throw new AnioInvalidoException("El año de publicación no puede ser negativo");
                }
            } catch (AnioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }

        } while (!correcto);

        Libro nuevoLibro = new Libro(titulo, autor, isbn, anioPublicacion);
        libros.add(nuevoLibro);
        inventario.put(nuevoLibro, 0);
        System.out.println("Libro añadido correctamente al catálogo.");
    }

    public static void mostrarCatalogo() {
        for (Libro libro : inventario.keySet()) {
            System.out.println(libro);
            System.out.println("\tEjemplares disponibles: " + inventario.get(libro));
        }
    }

    public static void gestionarEjemplares() {
        boolean correcto;
        for (Libro libro : inventario.keySet()) {
            System.out.println(libro);
            int cantidad = 0;
            do {
                correcto = true;
                try {
                    cantidad = sc.pedirNumero("Introduce la cantidad de ejemplares disponibles para este libro: ");
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

