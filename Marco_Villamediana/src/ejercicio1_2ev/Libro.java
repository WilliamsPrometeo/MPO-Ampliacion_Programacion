package ejercicio1_2ev;

/**
 * Clase Libro
 *
 * @author : Marco Villamediana
 * @version 1.0
 */


public class Libro {
    //Atributos privados
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructores

    /**
     * Constructor principal de la clase Libro
     * @param isbn
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */

    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Getters

    /**
     * Getter del atributo isbn
     *
     * @return el isbn del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Método para mostrar los datos del libro
     *
     * @return texto formateado con los datos del libro
     */

    @Override
    public String toString() {
        return String.format("Libro: %s, %s,\n\tAutor: %s | Año de publicación: %d", isbn, titulo, autor, anioPublicacion);
    }

    /**
     * Método para que el Map identifique correctamente las claves
     *
     * @param obj   the reference object with which to compare.
     *
     * @return libro
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        String isbn = String.valueOf(libro.getIsbn());

        return libro!= null ? isbn.equals(String.valueOf(libro.isbn)): String.valueOf(libro.isbn) == null;
    }

    /**
     * Método para que el Map identifique correctamente las claves
     *
     * @return isbn
     */

    @Override
    public int hashCode() {
        return String.valueOf(isbn) !=null ? String.valueOf(isbn).hashCode() : 0;
    }
}
