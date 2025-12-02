package biblioteca_libros;

import java.util.ArrayList;

/**
 * Clase Biblioteca
 *
 * @author Alumno- Hugo
 * @version 1.0
 */
public class Biblioteca {
    private ArrayList<Libro> catalogo;

    public Biblioteca() {catalogo = new ArrayList<>(); }

    public ArrayList<Libro> getCatalogo() { return catalogo; }

    public void setCatalogo(ArrayList<Libro> catalogo) { this.catalogo = catalogo; }

    //Metodos

    /**
     * Metodo para añadir libros a la ArrayList
     * @param libro establece el objeto libro
     */
    public void addLibro(Libro libro) {
        catalogo.add(libro);
    }

    /**
     *  Metodo para que te muestra los libros guardados en la ArrayList
     */
    public void mostrarLibros() {
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }

    /**
     *  Metodo para buscar libros en funcion del autor estipulado
     *  si el autor introducido coincide con el de la Array printea el libro
     * @param autor determina el nombre del autor
     */
    public void buscarPorAutor(String autor) {
        for (Libro libro : catalogo) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }
}
