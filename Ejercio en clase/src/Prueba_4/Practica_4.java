package Prueba_4;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


import static Practica_4.usuarios;

public class Practica_4 {
    private static final Scanner sc = new Scanner(System.in);
    private static Map<String, String> usuarios = new HashMap<>();

    public static void main (String[] args) { menu();}

    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println(" ==== Gestión de inventario ====");
                System.out.println("1. Añadir producto" +
                        "\n2. Buscar producto" +
                        "\n3. Actualizar precio" +
                        "\n4. Mostrar inventario" +
                        "\n5. Salir");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        Añadirproducto();
                        break;
                    case 2:
                        Buscarproducto();
                        break;
                    case 3:
                        Actualizarprecio();
                        break;
                    case 4:
                        System.out.println("... Saliendo ... ");
                        break;
                    default:
                        System.out.println("opcion invalida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opcion tiene que ser numerica");
                sc.nextLine();
            } catch (UserPrincipalNotFoundException e) {
                throw new RuntimeException(e);
            }
        } while (opcion != 4);
    }

    private static void Añadirproducto() throws UserPrincipalNotFoundException {
            System.out.print("Introduce el nombre del producto: ");
            String usarname = sc.nextLine();
            if (!usuarios.containsKey(usarname)) {
                throw new UserPrincipalNotFoundException("Usuario no encontrado");
            }
            String passUser = usuarios.get(usarname);

            System.out.print("Introduce el precio del producto: ");
            String password = sc.nextLine();

            boolean validacion = passUser.equals(password);

            System.out.println(validacion);
            System.out.println(usarname);

        }

    protected static boolean containsKey(String nombre)

}
    public static void Buscarproducto() {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = Practica_4.sc.nextLine();
        try {
            if (Practica_4.containsKey(nombre)) ;
            {
                System.out.println("Producto " + nombre + " encontrado");
            } else {
                throw new UserPrincipalNotFoundException("Producto encontrado");
            }
        } catch (UserPrincipalNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void Actualizarprecio() {
    throw  new UnsupportedOperationException(" Actualizando producto.");
    }

    public static void Salir() {
    System.exit(4);
    System.out.println("Saliendo");

    }






