import java.util.ArrayList;

/**
 * Clase Biblioteca
 *
 * @author Alumno - Jaime Ruiz
 * @version 1.0
 */

public class Biblioteca {
//Atributos privados
    private ArrayList<Libro1> libros;

    //Constructores

    /**
     * Constructor principal de la clase biblioteca
     *
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }
//Getters y Setters

    /**
     * Getter del atributo libros
     * @return la lista de libros
     */
    public ArrayList<Libro1> getLibros() {
        return libros;
    }

    /**
     * Setter del atributo libros
     * @param libros establece los libros
     */
    public void setLibros(ArrayList<Libro1> libros) {
        this.libros = libros;
    }

    //Metodo añadirLibro

    /**
     * Metodo para añadir un libro a la lista
     * @param libro añade los libros a la lista
     */
    public void añadirLibro(Libro1 libro) {
        libros.add(libro);
    }

    //Metodo mostrarLibros

    /**
     * Metodo para recorrer la lista y mostrar los libros que hay en ella
     *
     */
    public void mostrarLibros() {
        for (Libro1 libro : libros) {
            System.out.println(libro);
        }
    }
//Metodo buscaPorAutor

    /**
     * Metodo para buscar en la lista por autor
     * @param autor el nombre del autor
     */
    public void buscarPorAutor(String autor) {
        for (Libro1 libro : libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }


}
