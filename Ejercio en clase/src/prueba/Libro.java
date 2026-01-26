package prueba;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) {this.anioPublicacion = anioPublicacion; }

    @Override
    public String toString() {
        return String.format("Isbn: %d, %s,\n\tTitulo: %s | Autor: %.2f", isbn, titulo, autor, anioPublicacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        String isbn = String.valueOf(libro.getIsbn());

        return isbn != null ? isbn.equals(String.valueOf(libro.isbn)) : String.valueOf(libro.isbn) == null;
    }
    @Override
    public int hashCode() {return String.valueOf(isbn) != null ? String.valueOf(isbn).hashCode(): 0;}
}
