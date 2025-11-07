public class Alumno {

    private String nombre;
    private double notaProgramacion;
    private double notaBasesdeDatos;
    private double notaEntorno;

    public Alumno(String nombre, double notaProgramacion, double notaBasesdeDatos, double notaEntorno) {
        this.nombre = nombre;
        this.notaProgramacion = notaProgramacion;
        this.notaBasesdeDatos = notaBasesdeDatos;
        this.notaEntorno = notaEntorno;
    }

    public double mediaNota(){
        double media = (notaProgramacion + notaBasesdeDatos + notaEntorno) / 3 ;
        return media;
    }

    public void mostrarMedia(){
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Nota Programación: " + notaProgramacion);
        System.out.println("Nota Bases de Datos: " + notaBasesdeDatos);
        System.out.println("Nota Entorno: " + notaEntorno);
        System.out.printf("Media de las tres asignaturas: %.2f ", mediaNota());
        if (mediaNota() >= 5) {
            System.out.println("Aprobado");
        }
        else  {
            System.out.println("Suspenso");
        }
    }
}
