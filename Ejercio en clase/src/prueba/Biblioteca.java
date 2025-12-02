package prueba;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() { libros = new ArrayList<>(); }

    public ArrayList<Libro> getLibros() { return libros; }

    public void setLibros(ArrayList<Libro> libros) { this.libros = libros; }

    public void agregarLibro(Libro libro) { libros.add(libro); }

    public void agregarLibro(String titulo, String autor) {
        for(Libro libro : libros){
            System.out.println(libro.getTitulo());
        }
    }
    public void mostrarLibros(Libro libro2) {
        for(Libro libro : libros){
            System.out.println(libro.getTitulo());
        }
    }
   public void BuscarLibro(String titulo, String autor) {
        for(Libro libro : libros){
            if(libro.getTitulo().equals(titulo) && libro.getAutor().equals(autor)){
                System.out.println(libro.getTitulo());
            }
        }
   }


    public void BuscarLibro(Libro libro1) {
    }
}

