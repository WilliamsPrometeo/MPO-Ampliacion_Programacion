package biblioteca;/*
Alumno - German Sanchez
DAW - Ampliacion de Programacion
21-11-2025
 */

public class Libreria {
    public static void main (String [] args) {
        Biblioteca b = new Biblioteca();

        b.añadirLibro(new Libro("El Quijote", "Cervantes"));
        b.añadirLibro(new Libro("Fundacion", "Isaac Asimov"));
        b.añadirLibro(new Libro("It", "Stephen King"));


        System.out.println("====Todos los libros====");
        b.lista();

    }
}
