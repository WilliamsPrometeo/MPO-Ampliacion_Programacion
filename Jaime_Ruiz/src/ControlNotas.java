import mapasBiblioteca.MyScanner;

public class ControlNotas {

    //Inicializamos el metodo mapasBiblioteca.MyScanner
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        System.out.println("=== Control de Notas ===");
        //Introduce los datos
        String nombre = sc.pedirSoloTexto("Introduce el nombre del alumno: ");

        double nota1= sc.pedirDecimal("Introduce la nota de base de datos: ");
        double nota2= sc.pedirDecimal("Introduce la nota de programación: ");
        double nota3=sc.pedirDecimal("Introduce la nota de base de entornos: ");



        //Creamos objeto alumno
        Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);


        //Llamamos al metodo MostrarResumen
        alumno.MostrarResumen();


        //Cerramos el mapasBiblioteca.MyScanner
        sc.cerrar();

    }



}
