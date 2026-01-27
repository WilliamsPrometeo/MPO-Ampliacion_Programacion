public class Libreria {

    /*
    Alumno - Jaime Ruiz
    DAW - Ampliacion de Programacion
    21/11/2025
 */

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro1 libro1 = new Libro1("Cervantes", "El Quijote");
        Libro1 libro2 = new Libro1("Isaac Asimov", "Fundación");
        Libro1 libro3 = new Libro1("Stephen King", "It");

        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);
        biblioteca.añadirLibro(libro3);

        System.out.println("=======Lista de libros======");
        biblioteca.mostrarLibros();

        System.out.println("=======Libros de Cervantes======");
        biblioteca.buscarPorAutor("Cervantes");

    }
}
