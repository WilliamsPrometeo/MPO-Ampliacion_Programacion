package proyecto4;

public class proyecto4 package control.stock.java;

public class ControlStock; {
private static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) { menu();}
public static String menu(){
    int option = 0;
    do {
        try {
            System.out.println("====GESTION DE INVENTARIO ===");
            System.out.println("1. Añadir producto" +
                    "\n 2. Buscar producto" +
                    "\n 3. Actualizar precio" +
                    "\n 4. Mostrar inventario" +
                    "\n 5. Salir");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    String nombre_producto = nombre () !=null ? "Validar producto, Invalidar producto";
                    System.out.println(nombre_producto);
                    break;
                case 2:
                    String buscar_producto = buscar () !=null ? "Producto encontrado, Producto no encontrado";
                    System.out.println(buscar_producto);
                    break;
                case 3:
                    String actualizacion_producto = actualizacion () !=null ? "Precio Actualizado";
                    System.out.println(actualizacion_producto);
                    break;
                case 4:
                    System.out.println("...Saliendo");
                    break;
                default:
                    break;
            }
        }catch (InputMismatchException e) {
            System.out.println("Ingrese el producto");
            option = sc.nextInt();
        }
    } while (option != 3);

    private static String nombre(); {
        try {
            String nombre = sc.nextLine();
            return nombre;
        }
        catch (InputMismatchException e){
            System.out.println("CodigoInvalidoException"); return null;}

        public static String buscar();{
            try {
                String buscar =  sc.nextLine();
                return buscar;
            }catch (InputMismatchException e) {
                System.out.println("ProductoNoEncontradoException"); return null;
            }


            public static String nombreProducto() throws InvalidUsernameException {
                System.out.println("Ingrese el nombre del producto");
                String nombre = sc.nextLine();
                if (nombre.length() < 4 && nombre.matches("[A-Za-z]") {
                    return nombre;
                }throw new InvalidUsernameException("Nombre incorrecto");

                public static String buscarProducto() throw  InvalidBuscarException {
                    System.out.println("Introducir nombre de Producto");
                    String buscar = sc.nextLine();
                    if (buscar.length() < 4 && buscar.matches("[A-Za-z]"))
                        && buscar.matches("[A-Za-z]"){
                        return buscar; }
                }
                throw new InvalidBuscarException("Producto no encontrado");
            }
        }
    }
}

     }




             {
}
