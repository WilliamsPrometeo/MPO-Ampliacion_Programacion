package ejercicio3;

/**
 * Clase Libro
 *
 * @author Alumno - Marco
 * @version 1.0
 */

public class Libro {
    //Atributos privados
    private String titulo;
    private String autor;

    //Constructores

    /**
     * Constructor principal de la clase Libro
     *
     * @param titulo establece el título del libro
     * @param autor establece el autor del libro
     */

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters y Setters

    /**
     * Getter del atributo titulo
     *
     * @return el titulo del libro
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del atributo título
     *
     * @param titulo establece el título del libro
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del atributo autor
     *
     * @return el autor del libro
     */

    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo autor
     *
     * @param autor establece el autor del libro
     */

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo toString

    /**
     * Metodo para mostrar los datos del libro
     *
     * @return texto formateado con los datos del libro
     */

    @Override
    public String toString() {
        return String.format("Titulo: %s | Autor: %s",  titulo, autor);
    }
}
