/**
 * Clase Libro
 *
 * @author Alumno - Jaime Ruiz
 * @version 1.0
 */
public class Libro {
//Atributos privados
    private String titulo;
    private String autor;

    //Constructores

    /**
     * Constructor principal de la clase Libro
      * @param autor establece el autor del libro
     * @param titulo establece el titulo del libro
     */

    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    //Getters y setters

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
     * @param titulo establece el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del atributo autor
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo autor
     *
     * @param autor establece el nombre del autor del libro
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
    public String toString(){
        return String.format("Titulo: %s - Autor: %s", titulo, autor);
    }
}
