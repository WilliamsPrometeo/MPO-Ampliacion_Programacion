package ejercicio3;

/*
    Alumno - Marco Villamediana
    DAW - Ampliacion de Programacion
    21/11/2025
 */

public class Libreria {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("Fundación", "Isaac Asimov");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println("=== TODOS LOS LIBROS ===");
        biblioteca.mostrarLibros();

        System.out.println("=== BÚSQUEDA POR AUTOR: Isaac Asimov ===" );
        biblioteca.buscarPorAutor("Isaac Asimov");
    }
}
