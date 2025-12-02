package biblioteca_libros;
/*
    Alumno - Hugo Rodriguez
    DAW - Ampliacion de Programacion
    21/11/2025
 */
public class Libreria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Dan", "Inferno");
        Libro libro2 = new Libro("Dan", "El codi da vinci");
        Libro libro3 = new Libro("Fernando", "13 perros");

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

        System.out.println("--- Catalogo de libros ---");
        biblioteca.mostrarLibros();

        System.out.println("--- Libros por autor: Dan Brown---");
        biblioteca.buscarPorAutor("Dan");
    }
}
