package prueba;

public class Libreria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Rompe cabeza", "Cristiano");
        Libro libro2 = new Libro("La paz", "Mesi");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);


        System.out.println("====Libros disponibles====");
        biblioteca.mostrarLibros(libro2);
        biblioteca.mostrarLibros(libro1);

    }

}