package biblioteca;

/**
 * Clase Libro
 * @autor Alumno - German Sanchez
 * @version 1.0
 */
public class Libro {
    //Atributos
    private String titulo;
    private String autor;

    //Constructor

    /**
     * Constructor principal de la Clase Libro
     * @param titulo establece el titulo del libro
     * @param autor establece el autor del libro
     */
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getter y Setters

    /**
     * Getter del atributo titulo
     *
     * @return el titulo del libro
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del atributo titulo
     *
     * @param titulo estable el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del atributo del autor
     *
     * @return el nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo autor
     *
     * @param autor estable el nombre del autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo toString
    /**
     * Metodo para mostrar los datos del libro
     *
     * @return texto formateando con los datos de la pelicula
     */
    public String toString(){
        return titulo + " " + autor;
    }
}
