package Simulacros.BibliotecaDeLibros;
/*
    Alumno - Julio Martín Rodríguez Sánchez
    DAW 1 - Ampliacion de Programacion
    21/11/2025
 */
public class Libreria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro l1 = new Libro("It", "Stephen King");
        Libro l2 = new Libro("El Hobbit", "J.R.R. Tolkien");
        Libro l3 = new Libro("Fundación", "Isaac Asimov");
        Libro l4 = new Libro("El Quijote", "Cervantes");

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);

        System.out.println("\n===TODOS LOS LIBROS===");
        biblioteca.mostrarLibro();

        System.out.println("\n===BÚSQUEDA POR AUTOR===");
        biblioteca.buscarPorAutor("Isaac Asimov");


    }
}
