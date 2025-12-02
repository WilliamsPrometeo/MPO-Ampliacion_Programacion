package Simulacros.Peliculas;

/*
    Alumno - Julio Rodríguez
    DAW - Ampliacion de Programacion
    20/11/2025
 */
public class GestorPeliculas {
    public static void main(String[] args) {

        Filmoteca filmoteca = new Filmoteca();
        Pelicula pelicula1 = new Pelicula("Interestelar", "Nolan", 280);
        Pelicula pelicula2 = new Pelicula("El señor de los anillos", "Peter", 180);
        Pelicula pelicula3 = new Pelicula("Oppenheimer", "Nolan", 180);
        Pelicula pelicula4 = new Pelicula("El padrino", "Francis", 175);

        filmoteca.añadirPelicula(pelicula1);
        filmoteca.añadirPelicula(pelicula2);
        filmoteca.añadirPelicula(pelicula3);
        filmoteca.añadirPelicula(pelicula4);

        System.out.println("===CATALOGO COMPLETO===");
        filmoteca.listarPeliculas();

        System.out.println("\n===PELICULAS ENTRE 180 min y 280 min===");
        filmoteca.buscarPorDuracion(180, 280);

        System.out.println("\n===PELICULAS POR DIRECTOR===");
        filmoteca.buscarPorDirector("Nolan");


    }

}
