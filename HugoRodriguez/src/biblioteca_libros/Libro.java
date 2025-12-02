package biblioteca_libros;

/**
 * ClaseLibro
 *
 * @author Alumno- Hugo
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private String autor;

    //Constructores

    /**
     * Constructor principal de la clase Libro
     *
     * @param autor establece el nombre del autor
     * @param titulo establece el nombre/titulo del libro
     */
    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    //Getters y setters

    /**
     * Getter del atributo autor
     *
     * @return el nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     *  Setter del atibuto autor
     *
     * @param autor establece el nombre del autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter del atributo titulo
     *
     * @return el nombre del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del atributo titulo
     *
     * @param titulo determina el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodo  toString

    /**
     * Metodo para mostrar los datos del libro
     *
     * @return texto formateado con los datos del libro
     */
    @Override
    public String toString() {
        return String.format("Autor: %s; Titulo: %s;", autor, titulo);
    }
}
