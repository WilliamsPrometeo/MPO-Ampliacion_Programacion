package Simulacros.BibliotecaDeLibros;

import java.util.ArrayList;

/**
 * Clase Biblioteca
 *
 * @author Julio Martín Rodríguez Sánchez
 * @version 1.0
 */

public class Biblioteca {
    //Atributo privado
    private ArrayList<Libro> libros;

    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //Getters y Setters
    /**
     * Getter del atributo ArrayList<Libro>.
     *
     * @return la lista de los libros.
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Setter del atributo ArrayList<Libro>.
     *
     * @param libros establece la lista de los libros.
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    //Metodo agregarLibro sirve para que se añadan los libros a la lista.

    /**
     *
     * @param libro establece que mediante este metodo se van agregar los libros que declaramos en la clase principal.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    //Metodo mostrarLibro
    /**
     * Sirve para que listemos todos los libros que tenemos agregados en el arrayList
     */
    public void mostrarLibro() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    //Metodo buscarPorAutor

    /**
     *
     * @param autor establece que mediante este metodo va a mostrar el resultado de la búsqueda del autor
     * que indiquemos en el criterio de búsqueda.
     */
    public void buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

}
