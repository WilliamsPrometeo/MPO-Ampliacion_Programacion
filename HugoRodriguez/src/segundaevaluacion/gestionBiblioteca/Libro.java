package segundaevaluacion.gestionBiblioteca;

/**
 * Clase que representa un libro con título, autor, ISBN y año de publicación
 *
 * @author Alumno- Hugo
 * @version 1.0.
 */

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    /**
     * Constructor por defecto de la clase Libro.
     */
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }
    /**
     * Getter para el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Setter para el título del libro.
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Getter para el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Setter para el autor del libro.
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Getter para el ISBN del libro.
     *
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * Setter para el ISBN del libro.
     *
     * @param isbn El nuevo ISBN del libro.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * Getter para el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    /**
     * Setter para el año de publicación del libro.
     *
     * @param anioPublicacion El nuevo año de publicación del libro.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    /**
     * Metodo para mostrar una representación en cadena del objeto Libro.
     *
     * @return Una cadena que representa el objeto Libro.
     */
    @Override
    public String toString() {
        return String.format("Libro: %s\n\tAutor: %s | ISBN: %s | Año de Publicación: %d", titulo, autor, isbn, anioPublicacion);
    }
    /**
     * Método para comparar dos objetos Libro basándose en su ISBN.
     *
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        return isbn != null ? isbn.equals(libro.getIsbn()) : libro.getIsbn() == null;
    }
    /**
     * Método para obtener el código hash del objeto Libro basándose en su ISBN.
     *
     * @return El código hash del objeto Libro.
     */
    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }
}
