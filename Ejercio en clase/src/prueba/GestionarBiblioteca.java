package prueba;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Gestionarbiblioteca {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList <Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> Catalogo = new LinkedHashMap<>();

public static void main(String[] args) { menu ();}
    
    public static void menu () {
    System.out.println("===== GESTIONAR BIBLIOTECA =====");
    Boolean exit;
    do {
        exit = false;
        int opcion = sc.pedirNumero("1. Registrar Libro. " + 
                "\n2. Mostrar Catalogo " + 
                "\n3. Gestionar Ejemplares" + 
                "\n4. Salir");
        switch (opcion) {
            case 1:
                addLibro();
                break;
                case 2:
                    mostrarCatalogo();
                    break;
                    case 3:
                        GestionarEjemplares
                                break;
                        case 4:
                            System.out.println("Saliendo.");
                            exit = true;
                            break;
                            default:
                                System.out.println("opcion incorrecta");
                                break;
                                
                                
        }
    } while (!exit);
    }

    private static void addLibro() {
    }
    private static void mostrarCatalogo() {
    }
    private static void GestionarEjemplares() {
    }
    private static void mostrarLibro(Libro libro) {
    
    }


    }

