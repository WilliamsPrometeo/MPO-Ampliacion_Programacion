package mapasBiblioteca;

/**
 * Clase MapasBiblioteca.Libro
 *
 * @author Alumno - Jaime Ruiz
 * @version 1.0
 */


//Atributos
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Contructor
     * @param isbn isbn libro
     * @param titulo el titulo del libro
     * @param autor autor libro
     * @param anioPublicacion año de publicacion
     */
    public Libro(int isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;


    }

    /**
     * getter isbn
     * @return isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * setter isbn
     * @param isbn
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * getter titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * setter titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * getter autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * setter autor
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * getter año
     * @return año
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * setter año
     * @param anioPublicacion
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * metodo to string
     * @return string formateado
     */
    @Override
    public String toString() {
        return String.format("MapasBiblioteca.Libro: %s, %s,\n\tAutor: %s | Año de publicación: %d", isbn, titulo, autor, anioPublicacion);
    }

    /**
     * equals
     * @param obj   the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        String isbn = String.valueOf(libro.getIsbn());

        return isbn != null ? isbn.equals(String.valueOf(libro.isbn)) :  String.valueOf(libro.isbn) == null;
    }

    /**
     * metodo hashcode
     * @return
     */
    @Override
    public int hashCode() {
        return String.valueOf(isbn) != null ? String.valueOf(isbn).hashCode() : 0;
    }
}
