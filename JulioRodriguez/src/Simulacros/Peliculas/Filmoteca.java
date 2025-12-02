package Simulacros.Peliculas;

import java.util.ArrayList;

/**
 * Clase Filmoteca
 *
 * @author Julio Rodríguez
 * @version 1.0
 */

//atributos
public class Filmoteca {
    private ArrayList<Pelicula> catalogo;

    //constructor
    public Filmoteca() {
        catalogo = new ArrayList<>();
    }

    //getter
    public ArrayList<Pelicula> getCatalogo() {
        return catalogo;
    }

    //setter
    public void setCatalogo(ArrayList<Pelicula> catalogo) {
        this.catalogo = catalogo;
    }

    //Método añadir Película, permite agregar películas para luego mostrarlas
    public void añadirPelicula(Pelicula pelicula) {
        catalogo.add(pelicula);
    }

    //Método listar películas, permite mostrar las películas que tenemos añadidas
    public void listarPeliculas() {
        for (Pelicula pelicula : catalogo) {
            System.out.println(pelicula);
        }
    }

    //Método buscar por duración, permite la búsqueda de la película según criterio (duración) que indiquemos
    public void buscarPorDuracion(int minimo, int maximo) {
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getDuracion() >= minimo && pelicula.getDuracion() <= maximo) {
                System.out.println(pelicula);
            }
        }
    }

    //Método buscar por director, permite la búsqueda de la película según criterio (director) que indiquemos.
    public void buscarPorDirector(String director) {
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getDirector().equals(director)) {
                System.out.println(pelicula);
            }
        }


    }


}