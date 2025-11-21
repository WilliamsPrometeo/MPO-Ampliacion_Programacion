package biblioteca;

import java.util.ArrayList;
public class Biblioteca {
    private ArrayList <Libro> lista;
    Biblioteca() {
        lista = new ArrayList<>();
    }


    public void añadirLibro(Libro libro) {
        lista.add(libro);
    }
    public void lista(){
        for (Libro libro : lista){
            System.out.println(libro);
        }
    }
     public void buscarPorAutor(String autor){
        for (Libro libro : lista){
            if (libro.getAutor().equals(autor)){
                System.out.println(libro);
            }
        }
     }
}
