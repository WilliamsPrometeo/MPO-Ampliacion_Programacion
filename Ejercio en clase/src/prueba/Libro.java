package prueba;

/**
 * Clase Libro
 * @autor alumno - Alejandro
 */
public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;

    //Constructor

    /**
     * Constructor principal de la clase Libro
     *
     * @param titulo EStablece el titulo del Libro
     * @param autor establece el autor del libro
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters

    /**
     * Getter del atributo titulo
     *
     * @return el titulo del libro
     */
    public String getTitulo() {return titulo;}

    /**
     * Setter del atributo titulo
     *
     * @param titulo establece el titulo del libro
     */
    public void setTitulo(String titulo) {this.titulo = titulo;}

    /**
     * Getter del atributo Autor
     *
     * @return el nombre del autor del libro
     */
    public String getAutor() {return autor;}

    /**
     * Setter del atributo del autor
     *
     * @param autor establece el nombre del autor
     */
    public void setAutor(String autor) {this.autor = autor;}


    //Metodo toString

    /**
     * Metodo para mostrar los datos del Libro
     *
     * @return texto formateado con los datos del libro
     */
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
}
