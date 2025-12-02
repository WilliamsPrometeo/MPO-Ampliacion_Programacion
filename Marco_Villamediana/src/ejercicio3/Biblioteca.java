package ejercicio3;

import java.util.ArrayList;

/**
 * Clase Biblioteca
 *
 * @author Alumno - Marco
 * @version 1.0
 */

public class Biblioteca {
    //Atributos
    /** Lista que almacena el catálogo de libros. */

    private ArrayList<Libro> catalogo;

    //Constructores

    /**
     * Constructor por defecto. Inicializa el catálogo como una lista vacía.
     */

    public Biblioteca(){
        catalogo = new ArrayList<>();
    }

    //Getters y setters

    /**
     * Getter de la lista completa del catálogo de libro
     *
     * @return una lista de objetos {@code Libro}
     */

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    /**
     * Setter de la lista completa del catálogo de libro
     *
     * @param catalogo establece el catálogo
     */

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    //Metodo agregarLibro

    /**
     * Metodo para añadir libros al catálogo
     *
     * @param libro establece el libro en el catálogo
     */

    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }

    //Metodo mostrarLibros

    /**
     * Metodo que muestra todos los libros en el catálogo
     */

    public void mostrarLibros(){
        for (Libro libro : catalogo){
            System.out.println(libro);
        }
    }

    //Metodo buscarPorAutor

    /**
     * Metodo que busca y muestra los libros según el nombre de un autor
     *
     * @param autor nombre del autor
     */

    public void buscarPorAutor(String autor){
        for (Libro libro : catalogo){
            if(libro.getAutor().equals(autor)){
                System.out.println(libro);
            }
        }
    }
}
