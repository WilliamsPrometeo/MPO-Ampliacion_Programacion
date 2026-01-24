package ejercicio1_2ev;


import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

public class GestionBiblioteca {
    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> bibliotecas = new LinkedHashMap<>();
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        System.out.println("==== GESTIÓN BIBLIOTECA ====");
        boolean salir;
        do {
            salir=false;
            int opcion = sc.pedirNumero("1. Registrar libro" +
                    "\n2. Mostrar catálogo" +
                    "\n3. Gestionar ejemplares" +
                    "\n4. Salir");
            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    gestionarEjemplares();
                    break;
                case 4:
                    System.out.println("Saliendo ....");
                    salir=true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!salir);
    }
    
    public static void registrarLibro() {
        boolean bien;
        String isbn = "";
        do {
            bien=true;
            try {
                isbn = sc.pedirSoloTexto("Ingrese ISBN: ");
                if (String.valueOf(isbn).isEmpty()) {
                    throw new IsbnInvalidoException("El ISBN no puede estar vacío");
                } else if (String.valueOf(isbn).length() < 5) {
                    throw new IsbnInvalidoException("El ISBN debe ocupar al menos 5 caracteres");
                } else {
                    for (Libro libro : libros) {
                        if (libro.getIsbn().equals(isbn)) {
                            throw new IsbnInvalidoException("El ISBN ya existe");
                        }
                    }
                }
            } catch (IsbnInvalidoException e) {
                System.out.println(e.getMessage());
                bien=false;
            }
        } while (!bien);
        
        String titulo = sc.pedirSoloTexto("Ingrese titulo: ");
        String autor = sc.pedirSoloTexto("Ingrese autor: ");
        int anioPublicacion = 0;
        do{
            bien = true;
            try{
                anioPublicacion = sc.pedirNumero("Ingrese anio publicacion: ");
                if (anioPublicacion <= 0) {
                    throw new AnioInvalidoException("El año de publicación no puede ser negativo");
                }
            } catch (AnioInvalidoException e) {
                System.out.println(e.getMessage());
                bien=false;
            }
        } while (!bien);
        
        libros.add(new Libro(isbn, titulo,autor, anioPublicacion ));
    }
    
    public static void mostrarLibros() {
        boolean bien;
        for (Libro libro : bibliotecas.keySet()) {
            System.out.printf("%s - Cantidad en la biblioteca: %s\n", libro, bibliotecas.get(libro));
        }
    }
    
    public static void gestionarEjemplares() {
        boolean bien;
        for (Libro libro : libros) {
            int cantidad = 0;
            do {
                bien = true;
                try{
                    System.out.println(libro);
                    cantidad = sc.pedirNumero("Ingrese cantidad en la biblioteca: ");
                    if (cantidad < 0) {
                        throw new CantidadInvalidaException("La cantidad en la biblioteca no puede ser negativa");
                    }
                } catch (CantidadInvalidaException e) {
                    System.out.println(e.getMessage());
                    bien=false;
                }
            } while (!bien);
            
            bibliotecas.put(libro, cantidad);
        }
    }
}
